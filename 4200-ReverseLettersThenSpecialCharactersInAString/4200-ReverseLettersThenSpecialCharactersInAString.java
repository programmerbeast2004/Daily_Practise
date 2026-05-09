// Last updated: 5/9/2026, 11:22:31 AM
class Solution {
    public String reverseByType(String s) {
        StringBuilder l=new StringBuilder();
        StringBuilder sp=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c>='a' &&c<='z') l.append(c);
            else sp.append(c);
        }
        l.reverse();
        sp.reverse();
        StringBuilder res=new StringBuilder();
        int i=0,j=0;
        for(char c:s.toCharArray()){
            res.append(c>='a' && c<='z' ? l.charAt(i++) : sp.charAt(j++));
        }
        return res.toString();
    }
}