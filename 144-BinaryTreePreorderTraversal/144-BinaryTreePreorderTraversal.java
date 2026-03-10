// Last updated: 3/10/2026, 3:54:12 PM
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
17    public List<Integer> preorderTraversal(TreeNode root) {
18        List<Integer>res=new ArrayList<>();
19        preorder(root,res);
20        return res;
21    }
22    public static void preorder(TreeNode root,List<Integer>res){
23        if(root==null) return;
24        res.add(root.val);
25        preorder(root.left,res);
26        preorder(root.right,res);
27    }
28}