// Last updated: 7/31/2025, 12:17:50 PM
class Solution {
    public int commonFactors(int a, int b) {
        int c=0;
        int lt=Math.min(a,b);
        for(int i=1;i<=lt;i++){
            if(a%i==0&&b%i==0){
                c++;
            }
        }
        return c;
    }
}