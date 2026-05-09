// Last updated: 5/9/2026, 11:25:01 AM
class Solution {
    public String finalString(String s) {
        int l=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<l;i++){
            char c=s.charAt(i);
            if(c=='i'){
                sb.reverse();
            }
            else{
                sb.append(c);
            }
        }

        return (sb.toString());
    }
}