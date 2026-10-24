// Last updated: 10/24/2026, 4:09:10 PM
1class Solution {
2    public int countKConstraintSubstrings(String s, int k) {
3        int l=0,o=0,z=0,c=0;
4        for(int r=0;r<s.length();r++){
5            if(s.charAt(r)=='0'){
6                o++;
7            }
8            else{
9                z++;
10            }
11            while(o> k && z>k){
12                if(s.charAt(l)=='0'){
13                    o--;
14                }
15                else{
16                    z--;
17                }
18                l++;
19            }
20            c+=r-l+1;
21        }
22        return c;
23    }
24}