// Last updated: 10/1/2025, 7:40:50 AM
class Solution {
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        Arrays.sort(position);
        int minF=1,maxF=position[n-1]-position[0];
        int res=0;
        while(minF<=maxF){
            int mid=minF+(maxF-minF)/2;
            if(CanPlace(mid,position,m)){
                res=mid;
                minF=mid+1;
            }
            else{
                maxF=mid-1;
            }
        }
        return res;
    }
    public static boolean CanPlace(int mid,int[] positions,int m){
        int prev=positions[0];
        int c=1;
        for(int i=1;i<positions.length;i++){
            int curr=positions[i];
            if(curr-prev>=mid){
                c++;
                prev=curr;
            }
            if(c==m){
                break;
            }
        }
        return c==m;
    }
}