// Last updated: 5/9/2026, 11:30:24 AM
class Solution {
    public int rotatedDigits(int n) {
        int c=0;
        for(int i=1;i<=n;i++){
            if(Good(i)) c++;
        }
        return c;
    }
    public boolean Good(int num){
        boolean has=false;
        while(num>0){
            int dt=num%10;
            if(dt==3 || dt==4 || dt==7){
                return false;
            }
            if(dt==2 || dt==5 || dt==6 | dt==9){
                has=true;
            }
            num/=10;
        }
        return has;
    } 
}