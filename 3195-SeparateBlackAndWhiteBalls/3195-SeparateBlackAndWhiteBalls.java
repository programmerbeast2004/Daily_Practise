// Last updated: 7/31/2025, 12:17:06 PM
class Solution {
    public long minimumSteps(String s) {
        long count0=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')count0+=1;
        }
        long ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ans+=count0;
            }else{
                count0--;
            }
        }
        return ans;
    }
}