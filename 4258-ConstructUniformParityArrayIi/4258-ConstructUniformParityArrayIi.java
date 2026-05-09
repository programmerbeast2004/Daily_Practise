// Last updated: 5/9/2026, 11:22:17 AM
class Solution {
    public boolean uniformArray(int[] nums1) {
        int o=0,e=0;
        int minEven=Integer.MAX_VALUE,minOdd=Integer.MAX_VALUE;
        for(int x:nums1){
            if(x%2==0){
                e++;
                minEven=Math.min(minEven,x);
            }
            else{
                o++;
                minOdd=Math.min(minOdd,x);
            }
        }
        if(o==0 || e==0)return true;
        return (minEven-minOdd)>=1;
    }
}