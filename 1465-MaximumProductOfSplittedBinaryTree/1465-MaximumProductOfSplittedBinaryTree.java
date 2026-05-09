// Last updated: 5/9/2026, 11:28:27 AM
class Solution {

    long MOD = 1000000007L;
    long totalSum = 0;
    long maxProduct = 0;

    // First DFS: calculate total sum
    private long getTotal(TreeNode node) {
        if (node == null) return 0;
        return node.val + getTotal(node.left) + getTotal(node.right);
    }

    // Second DFS: compute subtree sums & max product
    private long dfs(TreeNode node) {
        if (node == null) return 0;

        long left = dfs(node.left);
        long right = dfs(node.right);

        long subTreeSum = node.val + left + right;

        long product = subTreeSum * (totalSum - subTreeSum);
        maxProduct = Math.max(maxProduct, product);

        return subTreeSum;
    }

    public int maxProduct(TreeNode root) {
        totalSum = getTotal(root);
        dfs(root);
        return (int)(maxProduct % MOD);
    }
}
