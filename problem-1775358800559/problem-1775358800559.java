// Last updated: 4/5/2026, 8:43:20 AM
1class Solution {
2    public List<Integer> findGoodIntegers(int n) {
3        Map<Integer,Integer>map=new HashMap<>();
4        int limit=(int)Math.cbrt(n);
5        for(int a=1;a<=limit;a++){
6            for(int b=a;b<=limit;b++){
7                int s=a*a*a + b*b*b;
8                if(s>n)break;
9                map.put(s,map.getOrDefault(s,0)+1);
10            }
11        }
12        List<Integer>res=new ArrayList<>();
13        for(int key:map.keySet()){
14            if(map.get(key)>=2)
15                res.add(key);
16        }
17        Collections.sort(res);
18        return res;
19    }
20}