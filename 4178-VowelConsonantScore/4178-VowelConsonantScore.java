// Last updated: 5/9/2026, 11:22:39 AM
class Solution {
    public int vowelConsonantScore(String s) {
        int v=0, c=0;
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
                if("aeiou".indexOf(ch)!=-1){
                    v++;
                }
                else{
                    c++;
                }
            }
        }
       return c==0? 0: v/c;
    }
}