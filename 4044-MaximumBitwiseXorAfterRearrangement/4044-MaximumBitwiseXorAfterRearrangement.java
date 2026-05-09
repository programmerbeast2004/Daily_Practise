// Last updated: 5/9/2026, 11:23:24 AM
class Solution {
    public String maximumXor(String s, String t) {
        int ones=0,zeros=0;
        for(char c:t.toCharArray()){
            if(c=='1')ones++;
            else zeros++;
        }
        StringBuilder ans=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='0'){
                if(ones>0){
                    ans.append('1');
                    ones--;
                }
                else{
                    ans.append('0');
                    zeros--;
                }
            }
            else{
                if(zeros>0){
                    ans.append('1');
                    zeros--;
                }
                else{
                    ans.append('0');
                    ones--;
                }
            }
        }
        return ans.toString();
    }
}