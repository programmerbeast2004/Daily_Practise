// Last updated: 5/9/2026, 11:27:05 AM
class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Integer>list=new ArrayList<>(map.values());
        int ck=list.get(0);
        for(int i=1;i<list.size();i++){
            if(ck!=list.get(i))return false;
        }
        return true;
    }
}