// Last updated: 3/10/2026, 8:00:24 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public int sumOfLeftLeaves(TreeNode root) {
18        int sum=0;
19        if(root==null) return 0;
20        if(root.left!=null && root.left.left==null && root.left.right==null) sum+=root.left.val;
21        sum=sum+sumOfLeftLeaves(root.left);
22        sum+=sumOfLeftLeaves(root.right);
23        return sum;
24    }
25}