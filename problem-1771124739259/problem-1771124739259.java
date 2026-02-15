// Last updated: 2/15/2026, 8:35:39 AM
1class Solution {
2    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
3        
4        Set<Integer> bulb=new HashSet<>();
5        for(int b: bulbs){
6            if(bulb.contains(b)){
7                bulb.remove(b);
8            }
9            else{
10                bulb.add(b);
11            }
12        }
13        List<Integer> res=new ArrayList<>(bulb);
14        Collections.sort(res);
15        return res;
16    }
17}