// Last updated: 5/9/2026, 11:31:55 AM
class Solution {

    static class Trie {

        class Node {
            Node zero;
            Node one;
        }

        private Node root = new Node();

        // Insert number into Trie
        public void add(int val) {
            Node curr = root;

            for (int i = 31; i >= 0; i--) {
                int bit = (val >> i) & 1;

                if (bit == 0) {
                    if (curr.zero == null) {
                        curr.zero = new Node();
                    }
                    curr = curr.zero;
                } else {
                    if (curr.one == null) {
                        curr.one = new Node();
                    }
                    curr = curr.one;
                }
            }
        }

        // Find maximum XOR for given number
        public int getMax(int val) {
            Node curr = root;
            int maxXor = 0;

            for (int i = 31; i >= 0; i--) {
                int bit = (val >> i) & 1;

                // We want opposite bit to maximize XOR
                if (bit == 0) {
                    if (curr.one != null) {
                        maxXor |= (1 << i);
                        curr = curr.one;
                    } else {
                        curr = curr.zero;
                    }
                } else {
                    if (curr.zero != null) {
                        maxXor |= (1 << i);
                        curr = curr.zero;
                    } else {
                        curr = curr.one;
                    }
                }
            }

            return maxXor;
        }
    }

    public int findMaximumXOR(int[] nums) {
        Trie trie = new Trie();
        int max = 0;

        // Insert first number
        trie.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, trie.getMax(nums[i]));
            trie.add(nums[i]);
        }

        return max;
    }
}
