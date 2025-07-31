// Last updated: 7/31/2025, 12:18:49 PM
class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            if(noZero(n-i)&&noZero(i)){
                return new int[]{n-i,i};
            }
        }
        return new int[]{};
    }
    private static boolean noZero(int num) {

        while (num != 0)
            if (num % 10 == 0) return false;
            else num /= 10;

        return true;
    }
}