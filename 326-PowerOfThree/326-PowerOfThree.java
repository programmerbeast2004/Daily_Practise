// Last updated: 7/31/2025, 12:20:28 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i=0;i<31;i++){
            double pow=Math.pow(3,i);
            if(pow==n){
                return true;
            }
        }
        return false;
        
    }
}