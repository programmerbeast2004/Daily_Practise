// Last updated: 7/31/2025, 12:18:02 PM
class Solution {
    public int countEven(int num) {
        int c=0;
        for(int i=1;i<=num;i++){
            if(DSum(i)%2==0){
                c++;
            }
        }
        return c;
    }
    public int DSum(int num){
        int sum=0;
        while(num!=0){
            sum=sum+num%10;
            num=num/10;
        }
        return sum;
    }
}