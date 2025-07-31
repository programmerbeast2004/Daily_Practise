// Last updated: 7/31/2025, 12:19:59 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int s=0;
        int n=num;
        for(int i=1;i<n;i++){
            if(n%i==0){
                s=s+i;
            }
        }
        return num==s?true:false;
    }
}