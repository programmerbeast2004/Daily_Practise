// Last updated: 5/9/2026, 11:21:52 AM
class Solution {
    public int sumOfPrimesInRange(int n) {
        int r=reverse(n);
        int l=Math.min(n,r);
        int h=Math.max(n,r);
        boolean[]isPrime=sieve(h);
        int sum=0;
        for(int i=l;i<=h;i++){
            if(isPrime[i])sum+=i;
        }
        return sum;
    }
    public int reverse(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+(n%10);
            n/=10;
        }
        return rev; 
    }
    public boolean[]sieve(int n){
        boolean[]prime=new boolean[n+1];
        Arrays.fill(prime,true);
        if(n>=0)prime[0]=false;
        if(n>=1)prime[1]=false;
        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        return prime;
    }
}