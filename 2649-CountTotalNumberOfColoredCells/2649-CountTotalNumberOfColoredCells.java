// Last updated: 7/31/2025, 12:17:34 PM
class Solution {
    public long coloredCells(int n) {
        long cell=0;
        for(int i=1;i<=n;i++){
            if(i==1){
                cell=1;
            }
            else{
                cell+=4*(i-1);
            }
        }
        return cell;
    }
}