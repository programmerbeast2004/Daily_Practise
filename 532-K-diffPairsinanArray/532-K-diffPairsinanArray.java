// Last updated: 3/17/2026, 11:43:33 AM
1class Solution {
2    public int findPairs(int[] nums, int k) {
3        if (k < 0) return 0;
4
5        Arrays.sort(nums);
6
7        int i = 0, j = 1;
8        int c = 0;
9
10        while (j < nums.length) {
11
12            if (i == j) {
13                j++;
14            }
15            else if (nums[j] - nums[i] < k) {
16                j++;
17            }
18            else if (nums[j] - nums[i] > k) {
19                i++;
20            }
21            else {
22                c++;
23                i++;
24                j++;
25
26                // skip duplicates
27                while (j < nums.length && nums[j] == nums[j - 1]) {
28                    j++;
29                }
30            }
31        }
32
33        return c;
34    }
35}