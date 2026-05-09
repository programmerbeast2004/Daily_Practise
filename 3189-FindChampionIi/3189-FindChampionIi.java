// Last updated: 5/9/2026, 11:24:46 AM
class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] in=new int[n];
        for(int[] e:edges){
            int f=e[0];
            int t=e[1];
            in[t]++;
        }
        int ans=0;
        int c=0;
        for(int i=0;i<n;i++){
            if(in[i]==0){
               c++;
               if(c == 2) return -1;
                ans = i;
            }
        }
        return ans;
    }
}