// Last updated: 4/6/2026, 3:34:56 PM
1class Solution {
2    public boolean areOccurrencesEqual(String s) {
3        HashMap<Character,Integer>map=new HashMap<>();
4        for(char c:s.toCharArray()){
5            map.put(c,map.getOrDefault(c,0)+1);
6        }
7        List<Integer>list=new ArrayList<>(map.values());
8        int ck=list.get(0);
9        for(int i=1;i<list.size();i++){
10            if(ck!=list.get(i))return false;
11        }
12        return true;
13    }
14}