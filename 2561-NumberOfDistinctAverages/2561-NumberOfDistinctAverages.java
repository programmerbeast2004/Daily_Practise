// Last updated: 5/9/2026, 11:25:45 AM
class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        int i=0;
        int j=nums.length-1;
        while(i<j){
            set.add(nums[i]+nums[j]);
            i++;
            j--;
        }
        return set.size();
    }
}