// Last updated: 5/9/2026, 11:22:56 AM
class Solution {
    public int prefixConnected(String[] words, int k) {
        Map<String,Integer>map=new HashMap<>();
        for(String w:words){
            if(w.length()<k) continue;
            String pre=w.substring(0,k);
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        int g=0;
        for(int c:map.values()){
            if(c>=2){
                g++;
            }
        }
        return g;
        
    }
}