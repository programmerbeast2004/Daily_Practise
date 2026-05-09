// Last updated: 5/9/2026, 11:28:56 AM
class Solution {
    public int sumFourDivisors(int[] nums) {
        int res = 0;
        for(int n:nums){
            int cbrt = (int)Math.round(Math.cbrt(n));
            if(cbrt*cbrt*cbrt == n && isPrime(cbrt)){
                res+=1+cbrt+cbrt*cbrt+n;
                continue;
            }
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    int j = n/i;
                    if(i!=j && isPrime(i) && isPrime(j)){
                        res+=1+i+j+n;
                    }
                    break;
                }
            }
        }
        return res;
    }
    public boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}