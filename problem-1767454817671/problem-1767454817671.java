// Last updated: 1/3/2026, 9:10:17 PM
1class Solution {
2    public int minLength(int[] n, int k) {
3        int l=0;
4        int s=0;
5        int minLen=Integer.MAX_VALUE;
6        Map<Integer,Integer> map=new HashMap<>();
7        for(int r=0;r<n.length;r++){
8            // while(set.contains(n[r])){
9            //     set.remove(n[l]);
10            //     s=s-n[l];
11            //     l++;
12            // }
13            // set.add(n[r]);
14            // s=s+n[r];
15            // while(s>=k){
16            //     minLen=Math.min(minLen,r-l+1);
17            //     set.remove(n[l]);
18            //     s=s-n[l];
19            //     l++;
20            // }
21            map.put(n[r],map.getOrDefault(n[r],0)+1);
22            if(map.get(n[r])==1){
23                s+=n[r];
24            }
25            while(s>=k){
26                minLen=Math.min(minLen,r-l+1);
27                map.put(n[l],map.get(n[l])-1);
28                if(map.get(n[l])==0){
29                    s-=n[l];
30                }
31                l++;
32            }
33        }
34        if(minLen==Integer.MAX_VALUE){
35            return -1;
36        }
37        return minLen;
38    }
39}