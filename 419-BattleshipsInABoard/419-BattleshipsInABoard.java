// Last updated: 5/9/2026, 11:31:57 AM
class Solution {
    public int countBattleships(char[][] b) {
        int m=b.length;
        int n=b[0].length;
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(b[i][j]=='X'){
                    if(i>0 && b[i-1][j]=='X')continue;
                    if(j>0 && b[i][j-1]=='X')continue;
                    c++;
                }
            }
        }
        return c;
    }
}