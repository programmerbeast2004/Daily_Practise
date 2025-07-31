// Last updated: 7/31/2025, 12:19:04 PM
class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if((n==1)||(n==2)) return 1;
        int a=0;
        int b=1;
        int c=1;
        int curr=0;
        for(int i=3;i<=n;i++){
            curr=a+b+c;
            a=b;
            b=c;
            c=curr;
     
        }
        return curr;
    }
}