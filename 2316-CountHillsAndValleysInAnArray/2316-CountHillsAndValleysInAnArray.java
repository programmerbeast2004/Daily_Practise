// Last updated: 5/9/2026, 11:26:30 AM
class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length;
        List<Integer>arr=new ArrayList<>();
        arr.add(nums[0]);
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                arr.add(nums[i]);
            }
        }
        int c=0;
        for(int i=1;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i-1) && arr.get(i)>arr.get(i+1)){
                c++; //hills
            }
            else if(arr.get(i)<arr.get(i-1)&& arr.get(i)<arr.get(i+1)){
                c++; //valley
            }
        }
        return c;
    }
}