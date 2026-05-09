// Last updated: 5/9/2026, 11:22:10 AM
class Solution {
    public List<Integer> findGoodIntegers(int n) {
        Map<Integer,Integer>map=new HashMap<>();
        int limit=(int)Math.cbrt(n);
        for(int a=1;a<=limit;a++){
            for(int b=a;b<=limit;b++){
                int s=a*a*a + b*b*b;
                if(s>n)break;
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }
        List<Integer>res=new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)>=2)
                res.add(key);
        }
        Collections.sort(res);
        return res;
    }
}