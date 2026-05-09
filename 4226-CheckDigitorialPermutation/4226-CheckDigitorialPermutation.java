// Last updated: 5/9/2026, 11:22:20 AM
class Solution {
    public boolean isDigitorialPermutation(int n) {
        int o=n;
        int s=0;
        while(n>0){
            int dt=n%10;
            s+=f(dt);
            n/=10;
        }
        return same(s,o);
    }
    public boolean same(int a,int b){
        char[] x=String.valueOf(a).toCharArray();
        char[]y=String.valueOf(b).toCharArray();
        if(x.length!=y.length) return false;
        java.util.Arrays.sort(x);
        java.util.Arrays.sort(y);
        return java.util.Arrays.equals(x,y);
    }
    public int f(int n){
        int fa=1;
        for(int i=1;i<=n;i++){
            fa*=i;
        }
        return fa;
        
    }
}