// Last updated: 2/6/2026, 2:53:12 PM
1class Solution {
2    public int totalSteps(int[] nums) {
3        Stack<int[]> st=new Stack<>();
4        int ans=0;
5        for(int i=nums.length-1;i>=0;i--){
6            int steps=0;
7            while(!st.isEmpty()&& nums[i]>st.peek()[0]){
8                steps=Math.max(steps+1,st.peek()[1]);
9                st.pop();
10            }
11             ans=Math.max(ans,steps);
12            st.push(new int[]{nums[i],steps});
13        }
14       
15        return ans;
16    }
17}