// Last updated: 5/9/2026, 11:30:18 AM
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[]row:image){
            int l=0;
            int r=row.length-1;
            while(l<=r){
                int temp=row[l]^1;
                row[l]=row[r]^1;
                row[r]=temp;
                l++;
                r--;
            }

        }
        return image;
    }
}