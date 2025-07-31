// Last updated: 7/31/2025, 12:17:35 PM
class Solution {
    public int alternateDigitSum(int n) {
        int dt=0;
        int ans=0;
        while(n!=0){
            ans+=(Math.pow(-1,(dt++)))*n%10;
            n/=10;
        }
        return dt%2==0?-1*ans:ans;
    }
}