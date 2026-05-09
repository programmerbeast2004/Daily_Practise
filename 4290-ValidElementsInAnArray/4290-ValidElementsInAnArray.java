// Last updated: 5/9/2026, 11:21:53 AM
class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n=nums.length;
        int[]l=new int[n];
        int[]r=new int[n];
        l[0]=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            l[i]=Math.max(l[i-1],nums[i-1]);
        }
        r[n-1]=Integer.MIN_VALUE;
        for(int i=n-2;i>=0;i--){
            r[i]=Math.max(r[i+1],nums[i+1]);
        }
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>l[i] || nums[i]>r[i]){
                res.add(nums[i]);
            }
        }
        return res;
    }
}