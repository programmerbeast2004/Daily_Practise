// Last updated: 2/11/2026, 12:27:26 PM
1class Solution {
2
3    static class Trie {
4
5        class Node {
6            Node zero;
7            Node one;
8        }
9
10        private Node root = new Node();
11
12        // Insert number into Trie
13        public void add(int val) {
14            Node curr = root;
15
16            for (int i = 31; i >= 0; i--) {
17                int bit = (val >> i) & 1;
18
19                if (bit == 0) {
20                    if (curr.zero == null) {
21                        curr.zero = new Node();
22                    }
23                    curr = curr.zero;
24                } else {
25                    if (curr.one == null) {
26                        curr.one = new Node();
27                    }
28                    curr = curr.one;
29                }
30            }
31        }
32
33        // Find maximum XOR for given number
34        public int getMax(int val) {
35            Node curr = root;
36            int maxXor = 0;
37
38            for (int i = 31; i >= 0; i--) {
39                int bit = (val >> i) & 1;
40
41                // We want opposite bit to maximize XOR
42                if (bit == 0) {
43                    if (curr.one != null) {
44                        maxXor |= (1 << i);
45                        curr = curr.one;
46                    } else {
47                        curr = curr.zero;
48                    }
49                } else {
50                    if (curr.zero != null) {
51                        maxXor |= (1 << i);
52                        curr = curr.zero;
53                    } else {
54                        curr = curr.one;
55                    }
56                }
57            }
58
59            return maxXor;
60        }
61    }
62
63    public int findMaximumXOR(int[] nums) {
64        Trie trie = new Trie();
65        int max = 0;
66
67        // Insert first number
68        trie.add(nums[0]);
69
70        for (int i = 1; i < nums.length; i++) {
71            max = Math.max(max, trie.getMax(nums[i]));
72            trie.add(nums[i]);
73        }
74
75        return max;
76    }
77}
78