// Last updated: 10/1/2025, 3:37:50 PM
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)-> Integer.compare(b[1],a[1]));
        int ans=0;
        for(int[] boxType: boxTypes){
            int a=boxType[0];//No of Boxes
            int b=boxType[1]; //No of Units

            int Boxtotake=Math.min(truckSize,a); // Box that can be taken
            ans+=b*Boxtotake; //Total Number Of Units
            truckSize-=a; //Trcuk Size is decreasing
        
        if(truckSize<=0){
            break; //Less than zero hote he rok do !!
        }
        }
        return ans;
    }
}