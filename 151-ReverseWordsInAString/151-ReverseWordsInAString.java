// Last updated: 7/31/2025, 12:21:10 PM
class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            if(!arr[i].isBlank()){
                ans+=arr[i];
                ans+=" ";
            }
        }
        return ans.substring(0,ans.length()-1);
        
    }
}