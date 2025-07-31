// Last updated: 7/31/2025, 12:17:08 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        return num1(n,m)-num2(n,m);
    }
    public int num1(int n,int m){
        int s=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0) s=s+i;
        }
        return s;
    }
    public int num2(int n,int m){
        int s2=0;
        for(int i=1;i<=n;i++){
            if(i%m==0) s2=s2+i;
        }
        return s2;
    }
}