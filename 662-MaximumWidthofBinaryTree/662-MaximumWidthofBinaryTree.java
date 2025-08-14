// Last updated: 8/14/2025, 11:12:03 AM
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
import java.util.*;

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair> q = new LinkedList<>();
        int width = 0;
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair start = q.peek();
            int s = q.size();
            Pair end = null; // Fixed: capital P
            for (int i = 0; i < s; i++) {
                end = q.poll(); // Fixed: add ()
                if (end.node.left != null) {
                    q.add(new Pair(end.node.left, 2 * end.idx + 1));
                }
                if (end.node.right != null) {
                    q.add(new Pair(end.node.right, 2 * end.idx + 2));
                }
            }
            width = Math.max(width, end.idx - start.idx + 1);
        }
        return width;
    }
}

class Pair {
    TreeNode node;
    int idx;
    Pair(TreeNode node, int idx) { // Fixed: constructor
        this.node = node;
        this.idx = idx;
    }
}
