// Last updated: 7/31/2025, 12:18:08 PM
class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long sum=0,min=0,max=0;
        for(int x:differences){
            sum+=x;
            min = Math.min(min, sum);
            max = Math.max(max, sum);   
        }
        return (int) Math.max(0, (upper - lower) - (max - min) + 1);
        }
    }
