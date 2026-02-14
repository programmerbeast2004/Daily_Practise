// Last updated: 2/14/2026, 8:49:42 PM
1class Solution {
2    public int prefixConnected(String[] words, int k) {
3        Map<String,Integer>map=new HashMap<>();
4        for(String w:words){
5            if(w.length()<k) continue;
6            String pre=w.substring(0,k);
7            map.put(pre,map.getOrDefault(pre,0)+1);
8        }
9        int g=0;
10        for(int c:map.values()){
11            if(c>=2){
12                g++;
13            }
14        }
15        return g;
16        
17    }
18}