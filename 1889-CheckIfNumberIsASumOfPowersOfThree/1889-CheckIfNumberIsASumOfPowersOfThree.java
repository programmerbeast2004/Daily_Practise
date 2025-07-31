// Last updated: 7/31/2025, 12:18:31 PM
class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n>0){
            int rem=n%3;
            if(rem==2){
                return false;
            }
            n=n/3;
        }
        return true;
    }
}