// Last updated: 10/11/2026, 11:15:40 AM
1class NumArray {
2    int[] arr;
3    public NumArray(int[] nums) {
4        arr=Arrays.copyOf(nums,nums.length);
5        for(int i=1;i<nums.length;i++){
6            arr[i]+=arr[i-1];
7        }
8    }
9    
10    public int sumRange(int left, int right) {
11        if(left==0) return arr[right];
12        else return arr[right]-arr[left-1];
13    }
14}
15
16/**
17 * Your NumArray object will be instantiated and called as such:
18 * NumArray obj = new NumArray(nums);
19 * int param_1 = obj.sumRange(left,right);
20 */