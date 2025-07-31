// Last updated: 7/31/2025, 12:20:03 PM
class Solution {
    public int[] constructRectangle(int area) {
        int W=(int) Math.sqrt(area);
        while(area%W!=0){
            W--;
        }
        int L=area/W;
        return new int[]{L,W};
    }
}