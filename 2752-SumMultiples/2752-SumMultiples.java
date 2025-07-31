// Last updated: 7/31/2025, 12:17:20 PM
class Solution {
    public int sumOfMultiples(int n) {
        int s=0;
        for(int i=1;i<=n;i++){
            if((i%3==0)||(i%5==0)||(i%7==0)) s=s+i;
        }
        return s;
    }
}