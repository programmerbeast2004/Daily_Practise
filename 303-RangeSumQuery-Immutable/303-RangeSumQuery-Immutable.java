// Last updated: 3/26/2026, 2:30:20 AM
1class NumArray {
2    int[]pre;
3    public NumArray(int[] nums) {
4        int n=nums.length;
5        pre=new int[n];
6        pre[0]=nums[0];
7        for(int i=1;i<n;i++){
8            pre[i]=nums[i]+pre[i-1];
9        }
10    }
11    
12    public int sumRange(int left, int right) {
13        if(left==0)return pre[right];
14        return pre[right]-pre[left-1];
15    }
16}
17
18/**
19 * Your NumArray object will be instantiated and called as such:
20 * NumArray obj = new NumArray(nums);
21 * int param_1 = obj.sumRange(left,right);
22 */