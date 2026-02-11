// Last updated: 2/11/2026, 12:41:22 PM
1class Solution {
2
3    long MOD = 1000000007L;
4    long totalSum = 0;
5    long maxProduct = 0;
6
7    // First DFS: calculate total sum
8    private long getTotal(TreeNode node) {
9        if (node == null) return 0;
10        return node.val + getTotal(node.left) + getTotal(node.right);
11    }
12
13    // Second DFS: compute subtree sums & max product
14    private long dfs(TreeNode node) {
15        if (node == null) return 0;
16
17        long left = dfs(node.left);
18        long right = dfs(node.right);
19
20        long subTreeSum = node.val + left + right;
21
22        long product = subTreeSum * (totalSum - subTreeSum);
23        maxProduct = Math.max(maxProduct, product);
24
25        return subTreeSum;
26    }
27
28    public int maxProduct(TreeNode root) {
29        totalSum = getTotal(root);
30        dfs(root);
31        return (int)(maxProduct % MOD);
32    }
33}
34