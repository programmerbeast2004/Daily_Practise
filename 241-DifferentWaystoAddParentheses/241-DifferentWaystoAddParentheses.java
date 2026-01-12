// Last updated: 1/12/2026, 7:43:40 AM
1class Solution {
2    public List<Integer> diffWaysToCompute(String e) {
3        List<Integer> res=new ArrayList<>();
4        for(int i=0;i<e.length();i++){
5            char o=e.charAt(i);
6            if(o=='+' || o=='-' || o=='*'){
7                List<Integer> s1=diffWaysToCompute(e.substring(0,i));
8                List<Integer> s2=diffWaysToCompute(e.substring(i+1));
9                for(int a:s1){
10                    for(int b:s2){
11                        if(o=='+') res.add(a+b);
12                        else if(o=='-')res.add(a-b);
13                        else if(o=='*') res.add(a*b);
14                    }
15                }
16            }
17        }
18        if(res.isEmpty()) res.add(Integer.parseInt(e));
19        return res;
20    }
21}