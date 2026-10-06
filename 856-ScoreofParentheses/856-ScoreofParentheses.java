// Last updated: 10/6/2026, 8:17:07 PM
1class Solution {
2    public int scoreOfParentheses(String s) {
3        int score=0;
4        int depth=0;
5
6        for(int i=0;i<s.length();i++){
7            if(s.charAt(i)=='('){
8                ++depth;
9            }
10            else{
11                --depth;
12                if(s.charAt(i-1)=='('){
13                    score+=1<<depth;
14                }
15            }
16        }
17        return score;
18    }
19}