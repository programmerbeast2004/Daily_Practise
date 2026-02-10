// Last updated: 2/10/2026, 11:46:22 AM
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
17    public TreeNode reverseOddLevels(TreeNode root) {
18        dfs(root.left,root.right,1);
19        return root;
20    }
21    public void dfs(TreeNode node1,TreeNode node2,int l){
22        if(node1==null ||node2==null ) return ;
23
24        if(l%2==1){
25            int temp=node1.val;
26            node1.val=node2.val;
27            node2.val=temp;
28        }
29        dfs(node1.left,node2.right,l+1);
30        dfs(node1.right,node2.left,l+1);
31
32    }
33}