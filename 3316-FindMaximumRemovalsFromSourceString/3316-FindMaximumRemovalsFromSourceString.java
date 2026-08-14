// Last updated: 8/14/2026, 9:21:39 PM
1class Solution {
2    public String makeFancyString(String s) {
3        StringBuilder ans=new StringBuilder();
4        
5        for(char c:s.toCharArray()){
6            int n=ans.length();
7            if(n>=2 && ans.charAt(n-1)==c && ans.charAt(n-2)==c){
8                continue;
9            }
10            ans.append(c);
11        }
12        return ans.toString();
13    }
14}