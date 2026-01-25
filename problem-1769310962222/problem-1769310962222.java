// Last updated: 1/25/2026, 8:46:02 AM
1class Solution {
2    public int[] rotateElements(int[] nums, int k) {
3        List<Integer> l=new ArrayList<>();
4        for(int x:nums){
5            if(x>=0)l.add(x);
6        }
7        int m=l.size();
8        if(m==0)return nums;
9        k=k%m;
10        Collections.rotate(l,-k);
11        int idx=0;
12        for(int i=0;i<nums.length;i++){
13            if(nums[i]>=0){
14                nums[i]=l.get(idx++);
15            }
16        }
17        return nums;
18    }
19}