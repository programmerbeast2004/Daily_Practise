// Last updated: 8/7/2025, 12:32:36 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxSumBST(TreeNode root) {
        return ValidBST(root).ans;
    }

    public BstPair ValidBST(TreeNode root) {
        if (root == null) return new BstPair();

        BstPair lbp = ValidBST(root.left);
        BstPair rbp = ValidBST(root.right);
        BstPair sbp = new BstPair();

        sbp.min = Math.min(root.val, Math.min(lbp.min, rbp.min));
        sbp.max = Math.max(root.val, Math.max(lbp.max, rbp.max));
        sbp.sum = lbp.sum + rbp.sum + root.val;

        sbp.isbst = lbp.isbst && rbp.isbst && (lbp.max < root.val) && (rbp.min > root.val);

        if (sbp.isbst) {
            sbp.ans = Math.max(lbp.ans, Math.max(rbp.ans, sbp.sum));
        } else {
            sbp.ans = Math.max(lbp.ans, rbp.ans);
            sbp.sum = 0; // sum shouldn't be counted if not BST
        }

        return sbp;
    }

    class BstPair {
        boolean isbst = true;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        int sum = 0;
        int ans = 0;
    }
}
