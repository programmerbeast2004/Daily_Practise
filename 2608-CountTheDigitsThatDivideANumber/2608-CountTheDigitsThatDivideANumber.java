// Last updated: 7/31/2025, 12:17:40 PM
class Solution {
    public int countDigits(int num) {
        int temp=num;
        int c=0;
        for(int i=temp;i>0;i=i/10){
            int dt=i%10;
            if(temp%dt==0){
                c++;
            }

        }
        return c;
    }
}