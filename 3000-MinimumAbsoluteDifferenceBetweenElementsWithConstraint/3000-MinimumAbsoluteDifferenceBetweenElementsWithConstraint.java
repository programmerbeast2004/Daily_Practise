// Last updated: 5/9/2026, 11:24:59 AM
class Solution {
    public int minAbsoluteDifference(List<Integer> nums, int x) {
        int n=nums.size();
        TreeSet<Integer> set = new TreeSet<>();
        int ans=Integer.MAX_VALUE;
        for(int i=x;i<n;i++){
                set.add(nums.get(i-x));
                Integer f=set.floor(nums.get(i));
                Integer c=set.ceiling(nums.get(i));
                if(f!=null){
                    ans=Math.min(ans,nums.get(i)-f);
                }
                if(c!=null){
                    ans=Math.min(ans,-nums.get(i)+c);
                }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}