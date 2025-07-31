// Last updated: 7/31/2025, 12:17:56 PM
class Solution {
    public String smallestNumber(String pattern) {
        int[] ans=new int[pattern.length()+1];
        int c=1;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=pattern.length();i++){
            if(i==pattern.length()||pattern.charAt(i)=='I'){
                ans[i]=c;
                c++;
                while(!st.isEmpty()){
                    ans[st.pop()]=c;
                    c++;
                }
            }
            else{
                st.push(i);
            }
        }
        String s="";
        for(int v:ans){
            s+=v;
        }
        return s;
    }
}