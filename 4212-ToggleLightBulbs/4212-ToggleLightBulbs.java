// Last updated: 5/9/2026, 11:22:28 AM
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        
        Set<Integer> bulb=new HashSet<>();
        for(int b: bulbs){
            if(bulb.contains(b)){
                bulb.remove(b);
            }
            else{
                bulb.add(b);
            }
        }
        List<Integer> res=new ArrayList<>(bulb);
        Collections.sort(res);
        return res;
    }
}