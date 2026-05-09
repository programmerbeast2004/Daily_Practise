// Last updated: 5/9/2026, 11:23:06 AM
class Solution {
    public boolean completePrime(int num) {
        String s=String.valueOf(num);
        for(int i=1;i<s.length();i++){
            int pre=Integer.parseInt(s.substring(0,i));
            int suf=Integer.parseInt(s.substring(i));
            if(!isPrime(pre) || !isPrime(suf)) return false;
        }
        return isPrime(num);
    }
    public boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        
        }
        return true;
    }
}