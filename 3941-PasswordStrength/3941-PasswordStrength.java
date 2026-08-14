// Last updated: 8/14/2026, 8:31:39 PM
1class Solution {
2    public int passwordStrength(String st) {
3        boolean[] seen=new boolean[128];
4        int s=0;
5        for(char c:st.toCharArray()){
6            if(seen[c]){
7                continue;
8            }
9            seen[c]=true;
10            if(c>='a'&& c<='z'){
11                s+=1;
12            }
13            else if(c>='A'&& c<='Z'){
14                s+=2;
15            }
16            else if(c>='0'&&c<='9'){
17                s+=3;
18            }
19            else{
20                s+=5;
21            }
22        }
23        return s;
24    }
25}