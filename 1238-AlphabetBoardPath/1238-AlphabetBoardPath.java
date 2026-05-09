// Last updated: 5/9/2026, 11:29:00 AM
class Solution {
    public String alphabetBoardPath(String target) {
        StringBuilder sb=new StringBuilder();
        int r=0,c=0;
        for(char ch:target.toCharArray()){
            int nr=(ch-'a')/5;
            int nc=(ch-'a')%5;

            while(c>nc){
                sb.append('L');
                c--;
            }
            while(r>nr){
                sb.append('U');
                r--;
            }
            while(r<nr){
                sb.append('D');
                r++;
            }
            while(c<nc){
                sb.append('R');
                c++;
            }
            sb.append('!');
        }
        return sb.toString();
    }
}