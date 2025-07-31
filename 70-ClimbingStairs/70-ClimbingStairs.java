// Last updated: 7/31/2025, 12:21:53 PM
class Solution {
    public int climbStairs(int n) {
        if(n==0||n==1){
            return 1;
        }
        int a=1,b=1;
        for(int i=2;i<=n;i++){
            int temp=a;
            a=b+a;
            b=temp;
        }
        return a;

        
    }
}