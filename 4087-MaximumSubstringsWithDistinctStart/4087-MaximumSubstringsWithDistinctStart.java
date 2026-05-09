// Last updated: 5/9/2026, 11:23:13 AM
class Solution {
    public int maxDistinct(String s) {
        boolean[] used=new boolean[256];
        int count=0;
        for(char c:s.toCharArray()){
            if(!used[c]){
                count++;
                used[c]=true;
            }
        }
        return count;
    }
}