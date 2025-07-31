// Last updated: 7/31/2025, 12:18:40 PM
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