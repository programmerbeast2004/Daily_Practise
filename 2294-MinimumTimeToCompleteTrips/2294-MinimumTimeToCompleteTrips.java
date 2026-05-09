// Last updated: 5/9/2026, 11:26:32 AM
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        //resubmitted same
        long left=1;
        long min=time[0];
        for(int t:time){
            if(t<min){
                min=t;
            }
        }
        long right = min*(long)totalTrips;
        while(left<right){
            long mid=left+(right-left)/2;
            long trips=0;
            for(int t: time){
                trips+=mid/t;
                if(trips>=totalTrips) break;
            }
            if(trips>=totalTrips){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;

    }
}