// Last updated: 10/2/2026, 9:03:53 AM
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> l1=new ArrayList<>();
4        parentheses(n,0,0,"",l1);
5        return l1;
6    }
7    public static void parentheses(int n,int closed,int open,String ans,List<String> l1) {
8		if(open==n && closed==n) {
9			l1.add(ans);
10			return;
11			
12		}
13		if(open>n || closed>open) {
14			return;
15		}
16		parentheses(n,closed,open+1,ans+"(",l1);
17		parentheses(n,closed+1,open,ans+")",l1);
18	}
19}