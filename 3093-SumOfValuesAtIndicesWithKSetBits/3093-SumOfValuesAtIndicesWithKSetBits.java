// Last updated: 5/9/2026, 11:24:52 AM
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            if(Integer.bitCount(i)==k){
                sum+=nums.get(i);
            }
        }
        return sum;
    }
}