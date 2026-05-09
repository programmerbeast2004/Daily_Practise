// Last updated: 5/9/2026, 11:24:31 AM
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int numEmpty=0;
        int numDrink=0;
        while(numEmpty>=numExchange ||numBottles!=0){
            if(numEmpty<numExchange){
                numEmpty+=numBottles;
                numDrink+=numBottles;
                numBottles-=numBottles;
            }
            else{
                numEmpty=numEmpty-numExchange;
                numExchange++;
                numBottles++;
            }
        }
        return numDrink;
    }
}