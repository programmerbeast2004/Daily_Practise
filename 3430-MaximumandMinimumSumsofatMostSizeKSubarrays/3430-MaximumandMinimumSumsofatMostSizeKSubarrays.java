// Last updated: 1/20/2026, 11:45:58 PM
1class Solution {
2    public long minMaxSubarraySum(int[] nums, int k) {
3        return minOrMaxSum(nums, k, true) + minOrMaxSum(nums, k, false);
4    }
5
6    private long minOrMaxSum(int[] nums, int k, boolean isMin) {
7        long sum = 0L;
8        int n = nums.length;
9        LinkedList<Integer> stack = new LinkedList<>();
10        stack.addFirst(-1);
11
12        for (int i = 0; i <= n; i++) {
13            while (stack.peekFirst() != -1 &&
14                (i == n ||
15                 (isMin && nums[stack.peekFirst()] >= nums[i]) || 
16                 (!isMin && nums[stack.peekFirst()] <= nums[i]))) {
17                
18                int middle = stack.removeFirst();
19                int left = stack.peekFirst() + 1;
20                int right = i - 1;
21                int minLeft = Math.max(left, middle - k + 1);
22                int maxRight = Math.min(middle + k - 1, right);
23                long subArrayCount = 0L;
24
25                if (maxRight - minLeft < k) {
26                    // Can ignore k in this case
27                    // => subArrayCount = (numOfLeftElements + 1) * (numOfRightElements + 1)
28                    subArrayCount = (middle - minLeft + 1L) * (maxRight - middle + 1L);
29                } else {
30                    // To optimize performance, compare the number of possible left boundaries and
31                    // right boundaries. Choose the side with fewer elements to minimize computation.
32                    if (middle - minLeft < maxRight - middle) {
33                        // Count subarrays starting from l
34                        for (int l = minLeft; l <= middle; l++) {
35                            int maxR = Math.min(right, l + k - 1);
36                            subArrayCount += Math.max(maxR - middle + 1, 0);
37                        }
38                    } else {
39                        // Count subarrays ending at r
40                        for (int r = middle; r <= maxRight; r++) {
41                            int minL = Math.max(r - k + 1, left);
42                            subArrayCount += Math.max(middle - minL + 1, 0);
43                        }
44                    }
45                }
46
47                sum += subArrayCount * nums[middle];
48            }
49            stack.addFirst(i);
50        }
51
52        return sum;
53    }
54}