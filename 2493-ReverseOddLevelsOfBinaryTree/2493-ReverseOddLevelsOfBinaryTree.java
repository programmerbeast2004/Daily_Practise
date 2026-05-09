// Last updated: 5/9/2026, 11:25:53 AM
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
    public TreeNode reverseOddLevels(TreeNode root) {
        dfs(root.left,root.right,1);
        return root;
    }
    public void dfs(TreeNode node1,TreeNode node2,int l){
        if(node1==null || node2==null ) return ;

        if(l%2!=0){
            int temp=node1.val;
            node1.val=node2.val;
            node2.val=temp;
        }
        dfs(node1.left,node2.right,l+1);
        dfs(node1.right,node2.left,l+1);

    }
}