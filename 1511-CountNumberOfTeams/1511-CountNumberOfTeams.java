// Last updated: 5/9/2026, 11:28:20 AM
class Solution {
    public int numTeams(int[] rating) {
        int n=rating.length;
        int ans=0;
        for(int j=1;j<n-1;j++){
            int ls=0,rs=0,rg=0,lg=0;

            for(int i=0;i<j;i++){
                if(rating[i]<rating[j]) ls++;
                else if(rating[i]>rating[j]) lg++;
            }

            for(int k=j+1;k<n;k++){
                if(rating[k]<rating[j]) rs++;
                else if(rating[k]>rating[j]) rg++;
            }
            ans+=ls*rg;
            ans+=lg*rs;
        }
        return ans;
    }
}