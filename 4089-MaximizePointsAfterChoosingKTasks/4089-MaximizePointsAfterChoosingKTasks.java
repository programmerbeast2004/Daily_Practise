// Last updated: 5/9/2026, 11:23:12 AM
class Solution {
    public long maxPoints(int[] technique1, int[] technique2, int k) {
        int n=technique1.length;
        long bs=0;
        int[] diff=new int[n];
        for(int i=0;i<n;i++){
            bs+=technique2[i];
            diff[i]=technique1[i]-technique2[i];
        }
        Arrays.sort(diff);
        long ans=bs;
        for(int i=n-1;i>=n-k;i--){
            ans+=diff[i];
        }
        for(int i=n-k-1;i>=0;i--){
            if(diff[i]>0){
                ans+=diff[i];
            }
            else{
                break;
            }
        }
        return ans;
    }
}