// Last updated: 7/31/2025, 12:20:53 PM
public class Solution {
    public static boolean isHappy(int n) {
        if(n<10){
            return n==1 || n==7;
        }
        int sum=0;
        while(n>0){
            int dt=n%10;
            sum+=dt*dt;
            n/=10;
        }
        return isHappy(sum);
    }
}