// Last updated: 5/9/2026, 11:26:07 AM
class Solution {
    public char repeatedCharacter(String s) {
        boolean[]f=new boolean[26];
        for(char c:s.toCharArray()){
            if(f[c-'a']){
                return c;
            }
            f[c-'a']=true;
        }
        return ' ';
    }
}