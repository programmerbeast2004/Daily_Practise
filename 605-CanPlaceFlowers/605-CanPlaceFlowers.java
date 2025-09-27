// Last updated: 9/27/2025, 5:46:50 AM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l=flowerbed.length;
        for(int i=0;i<l && n>0;i++){
            if(flowerbed[i]==0){
                boolean left=(i==0)||(flowerbed[i-1]==0);
                boolean right=(i==l-1)||(flowerbed[i+1]==0);

                if(left && right){
                    flowerbed[i]=1;
                    n--;
                }
            }
        }
        return n==0;
    }
}