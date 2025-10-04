// Last updated: 10/4/2025, 3:31:35 PM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList=new ArrayList<>();
        helper(0,nums,new ArrayList<>(),ansList);
        return ansList;
    }
    public static void helper(int idx,int[] nums,List<Integer> ds,List<List<Integer>> anslist){
        anslist.add(new ArrayList<>(ds)); 
        for(int i = idx;i<nums.length;i++) {
            if(i!=idx && nums[i] == nums[i-1]) continue; 
            ds.add(nums[i]); 
            helper(i+1, nums, ds, anslist); 
            ds.remove(ds.size() - 1);
        }
    }
}