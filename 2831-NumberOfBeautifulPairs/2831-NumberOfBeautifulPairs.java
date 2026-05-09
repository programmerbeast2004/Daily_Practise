// Last updated: 5/9/2026, 11:25:06 AM
class Solution {
    public int countBeautifulPairs(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int f=nums[i];
            while(f>=10){
                f/=10;
            }
        for(int j=i+1;j<nums.length;j++){
            int l=nums[j]%10;

            if(gcd(f,l)==1){
                c++;
            }
        }
        }
        return c;
    }
    private int gcd(int a,int b){
        int res=Math.min(a,b);
        while(res>0){
            if(a%res==0 && b%res==0){
                break;
            }
            res--;
        }
        return res;
    }
}