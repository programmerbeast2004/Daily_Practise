// Last updated: 5/9/2026, 11:30:50 AM
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