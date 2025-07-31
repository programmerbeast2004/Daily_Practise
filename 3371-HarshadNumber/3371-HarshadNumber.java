// Last updated: 7/31/2025, 12:16:55 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int s=0;
        int n=x;
        while(n>0){
            s=s+n%10;
            n=n/10;
        }
        if(x%s==0){
            return s;
        }
        return -1;
    }
}