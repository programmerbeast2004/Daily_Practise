// Last updated: 10/2/2025, 6:58:26 AM
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