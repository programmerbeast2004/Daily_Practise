// Last updated: 8/14/2025, 11:10:29 AM
import java.util.*;

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int width = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            int minIndex = q.peek().idx; // normalize to prevent overflow
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                Pair current = q.poll();
                int currIndex = current.idx - minIndex; // normalized index

                if (i == 0) first = currIndex;
                if (i == size - 1) last = currIndex;

                if (current.node.left != null) {
                    q.add(new Pair(current.node.left, 2 * currIndex + 1));
                }
                if (current.node.right != null) {
                    q.add(new Pair(current.node.right, 2 * currIndex + 2));
                }
            }
            width = Math.max(width, last - first + 1);
        }
        return width;
    }
}

class Pair {
    TreeNode node;
    int idx;
    Pair(TreeNode node, int idx) {
        this.node = node;
        this.idx = idx;
    }
}
