// Last updated: 3/10/2026, 4:17:34 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> children;
6
7    public Node() {}
8
9    public Node(int _val) {
10        val = _val;
11    }
12
13    public Node(int _val, List<Node> _children) {
14        val = _val;
15        children = _children;
16    }
17}
18*/
19
20class Solution {
21    public List<Integer> postorder(Node root) {
22        List<Integer> res=new ArrayList<>();
23        dfs(root,res);
24        return res;
25    }
26    public static void dfs(Node root,List<Integer> res){
27        if(root==null) return;
28        for(Node child:root.children){
29            dfs(child,res);
30        }
31        res.add(root.val);
32    }
33}