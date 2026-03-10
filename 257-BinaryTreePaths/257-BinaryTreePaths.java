// Last updated: 3/10/2026, 10:56:33 AM
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
17    public List<String> binaryTreePaths(TreeNode root) {
18        List<String> res=new ArrayList<>();
19        StringBuilder sb=new StringBuilder();
20        helper(res,root,sb);
21        return res;
22    }
23    private void helper(List<String> res,TreeNode root,StringBuilder sb){
24        if(root==null){
25            return;
26        }
27        int len=sb.length();
28        sb.append(root.val);
29        if(root.left==null && root.right==null){
30            res.add(sb.toString());
31        }
32        else{
33            sb.append("->");
34            helper(res,root.left,sb);
35            helper(res,root.right,sb);
36        }
37        sb.setLength(len);
38    }
39}