// Last updated: 3/10/2026, 12:51:17 PM
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
17    public List<TreeNode> generateTrees(int n) {
18        return dfs(1,n);
19    }
20    public List<TreeNode>dfs(int i,int j){
21        List<TreeNode>res=new ArrayList<>();
22        if(i>j){
23        res.add(null);
24        return res;
25        }
26        for(int x=i;x<=j;x++){
27            List<TreeNode> lts=dfs(i,x-1);
28            List<TreeNode> rts=dfs(x+1,j);
29            for(TreeNode lt:lts){
30                for(TreeNode rt:rts){
31                    TreeNode root=new TreeNode(x,lt,rt);
32                    res.add(root);
33                }
34            }
35        }
36        return res;
37    }
38}