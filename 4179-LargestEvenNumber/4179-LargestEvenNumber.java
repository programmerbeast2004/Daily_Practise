// Last updated: 5/9/2026, 11:22:38 AM
class Solution {
    public String largestEven(String s) {
        int idx=-1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='2'){
                idx=i;
                break;
            }
        }
        return s.substring(0,idx+1);
    }
}