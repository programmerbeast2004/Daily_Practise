// Last updated: 5/9/2026, 11:27:36 AM
class Solution {
    public String longestNiceSubstring(String s) {
        if(s.length()<2) return "";
        boolean[] seen=new boolean[128];
        for(char c:s.toCharArray())seen[c]=true;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(seen[Character.toLowerCase(c)] && seen[Character.toUpperCase(c)]){
                continue;
            }
            String l=longestNiceSubstring(s.substring(0,i));
            String r=longestNiceSubstring(s.substring(i+1));
            return l.length()>=r.length() ? l:r;
        }
        return s;
    }
}