// Last updated: 10/4/2025, 1:50:45 PM
class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,0,new LinkedList<>(),ans);
        return ans;
    }
    public static void helper(int[] nums,int s, LinkedList<Integer>path,List<List<Integer>> ans){
        if(path.size()>1){
            ans.add( new LinkedList<>(path));
        }
        Set<Integer>used=new HashSet<>();
        for(int i=s;i<nums.length;i++){
            if(used.contains(nums[i])){
                continue;
            }
            if (path.isEmpty() || nums[i] >= path.getLast()) {
                used.add(nums[i]);
                path.addLast(nums[i]);
                helper(nums,i+1,path,ans);
                path.removeLast();
            }
        }

    }
}