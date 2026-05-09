// Last updated: 5/9/2026, 11:25:56 AM
class Solution {
    public String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='*'){
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}