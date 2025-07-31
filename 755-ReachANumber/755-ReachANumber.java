// Last updated: 7/31/2025, 12:19:41 PM
class Solution {
    public int reachNumber(int target) {
        int sum=0;
        int step=0;
        target = Math.abs(target);
        while(sum<target){
            step++;
            sum=sum+step;
        }
        while((sum-target)%2==1){
            step++;
            sum=sum+step;
        }
        return step;
    }
}