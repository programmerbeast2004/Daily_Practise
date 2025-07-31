// Last updated: 7/31/2025, 12:20:51 PM
class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        return PrintSieve(n);
        
    }
    public static int PrintSieve(int n) {
        int[] ans = new int[n];
        ans[0] = ans[1] = 1; // 0 and 1 are not prime numbers

        for (int i = 2; i * i <= n; i++) {
            if (ans[i] == 0) { // i is prime
                for (int j = 2; i * j < n; j++) {
                    ans[i * j] = 1; // Mark multiples of i as non-prime
                }
            }
        }
        int c=0;
        for(int i=2;i<ans.length;i++){
            if(ans[i]==0){
                c++;
            }
        }
        return c;
    }
}