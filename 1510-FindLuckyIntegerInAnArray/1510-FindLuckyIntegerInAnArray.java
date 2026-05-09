// Last updated: 5/9/2026, 11:28:21 AM
class Solution {
    public int findLucky(int[] arr) {
        int[]f=new int[501];
        for(int num:arr){
            f[num]++;
        }
        for(int i=500;i>0;i--){
            if(f[i]==i){
                return i;
            }
        }
        return -1;

    }
}