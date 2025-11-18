// Last updated: 11/18/2025, 5:43:37 AM
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        while(i<bits.length-1){
            if(bits[i]==0){
                i++;
            }
            else{
                i+=2;
            }
        }
        return i==bits.length-1;
    }
}