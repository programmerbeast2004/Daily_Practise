// Last updated: 11/30/2025, 8:04:59 PM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        List<Integer> list=new ArrayList<>();
4        Arrays.sort(nums);
5        int min=nums[0];
6        int max=nums[nums.length-1];
7
8        int j=0;
9        for(int i=min;i<max;i++){
10            if(i!=nums[j]){
11                list.add(i);
12            }
13            else{
14                j++;
15            }
16        }
17        return list;
18    }
19}