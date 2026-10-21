// Last updated: 10/21/2026, 6:04:39 PM
1class Solution {
2    public int lastStoneWeight(int[] stones) {
3        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
4
5        for(int ele:stones){
6            pq.add(ele);
7        }
8
9        while(pq.size()>1){
10            int y=pq.remove();
11            int x=pq.remove();
12
13            if(x!=y){
14                pq.add(y-x);
15            }
16        }
17
18        return pq.isEmpty() ? 0:pq.peek();
19    }
20}