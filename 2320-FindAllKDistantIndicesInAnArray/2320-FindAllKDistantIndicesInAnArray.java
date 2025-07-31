// Last updated: 7/31/2025, 12:18:01 PM
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> result=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[j]==key && Math.abs(i-j)<=k){
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }
}