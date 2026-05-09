// Last updated: 5/9/2026, 11:26:39 AM
class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long te=0;
        for(int bt:batteries){
            te+=bt;
        }
        Arrays.sort(batteries);
        for(int i=batteries.length-1;i>=0;i--){
            if(batteries[i]>te/n){
                te-=batteries[i];
                n--;
            }
            else{
                break;
            }
        }
        return te/n;
    }
}