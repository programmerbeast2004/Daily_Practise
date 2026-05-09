// Last updated: 5/9/2026, 11:29:32 AM
class Solution {
    public int minDeletionSize(String[] strs) {
        int n=strs.length;
        int m=strs[0].length();
        boolean[] sorted=new boolean[n-1];
        int ans=0;
        for(int c=0;c<m;c++){
            boolean b=false;
            for(int r=0;r<n-1;r++){
                if(!sorted[r] && strs[r].charAt(c)>strs[r+1].charAt(c)){
                    b=true;
                    break;
                }
            }
            if(b){
                ans++;
                continue;
            }
            for(int r=0;r<n-1;r++){
                if(!sorted[r] && strs[r].charAt(c)<strs[r+1].charAt(c)){
                    sorted[r]=true;
                }
            }
        }
        return ans;
    }
}