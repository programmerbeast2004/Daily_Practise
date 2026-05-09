// Last updated: 5/9/2026, 11:22:42 AM
class Solution {
    public int[] rotateElements(int[] nums, int k) {
        List<Integer> l=new ArrayList<>();
        for(int x:nums){
            if(x>=0)l.add(x);
        }
        int m=l.size();
        if(m==0)return nums;
        k=k%m;
        Collections.rotate(l,-k);
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                nums[i]=l.get(idx++);
            }
        }
        return nums;
    }
}