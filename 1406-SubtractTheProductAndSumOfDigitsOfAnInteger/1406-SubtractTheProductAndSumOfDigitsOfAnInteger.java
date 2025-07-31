// Last updated: 7/31/2025, 12:18:56 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int diff=pro(n)-sum(n);
        return diff;
    }
    public int pro(int n){
        int p=1;
        for(int i=n;i>0;i=i/10){
            p=p*(int)(i%10);
        }
        return p;
    }
    public int sum(int n){
        int s=0;
        for(int i=n;i>0;i=i/10){
            s=s+(int)(i%10);
        }
        return s;
    }
    
}