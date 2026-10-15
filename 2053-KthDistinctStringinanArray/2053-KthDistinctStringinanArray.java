// Last updated: 10/15/2026, 11:13:23 AM
1class Solution {
2    public String kthDistinct(String[] arr, int k) {
3        HashMap<String,Integer> map=new HashMap<>();
4        for(String s:arr){
5            if(map.containsKey(s)){
6                map.put(s,map.get(s)+1);
7            }
8            else{
9                map.put(s,1);
10            }
11        }
12        int c=0;
13        for(String s:arr){
14            if(map.get(s)==1){
15                c++;
16                if(c==k){
17                    return s;
18                }
19            }
20        }
21        return "";
22    }
23}