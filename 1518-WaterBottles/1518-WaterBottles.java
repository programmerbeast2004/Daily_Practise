// Last updated: 10/1/2025, 5:40:53 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int c=0;
        c=c+numBottles;
        while(numBottles>=numExchange){
            int rem=numBottles%numExchange;
            int div=numBottles/numExchange;
            numBottles=div+rem;
            c=c+div;
        }
        return c;
    }
}