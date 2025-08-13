// Last updated: 8/13/2025, 10:23:52 AM
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