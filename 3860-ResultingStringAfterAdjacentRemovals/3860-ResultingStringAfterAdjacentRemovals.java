// Last updated: 5/9/2026, 11:23:40 AM
class Solution {
    public String resultingString(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(!st.isEmpty()){
                char t=st.peek();
                if(Math.abs(t-c)==1 || Math.abs(t-c)==25){
                    st.pop();
                    continue;
                }
            }
            st.push(c);
        }
        StringBuilder res=new StringBuilder();
        for(char c:st){
            res.append(c);
        }
        return res.toString();
    }
}