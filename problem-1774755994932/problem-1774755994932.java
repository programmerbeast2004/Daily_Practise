// Last updated: 3/29/2026, 9:16:34 AM
1class EventManager {
2    private Map<Integer,Integer>map;
3    private PriorityQueue<int[]>pq;
4    public EventManager(int[][] events) {
5        map=new HashMap<>();
6        pq=new PriorityQueue<>((a,b)->{
7            if(b[0]!=a[0])return b[0]-a[0];
8            return a[1]-b[1];
9        });
10        for(int[]e:events){
11            int id=e[0],pr=e[1];
12            map.put(id,pr);
13            pq.offer(new int[]{pr,id});
14        }
15    }
16    
17    public void updatePriority(int eventId, int newPriority) {
18        map.put(eventId,newPriority);
19        pq.offer(new int[]{newPriority,eventId});
20    }
21    
22    public int pollHighest() {
23        while(!pq.isEmpty()){
24            int[]top=pq.peek();
25            int pr=top[0];
26            int id=top[1];
27            if(map.containsKey(id)&& map.get(id)==pr){
28                pq.poll();
29                map.remove(id);
30                return id;
31            }
32            pq.poll();
33        }
34        return -1;
35        
36    }
37}
38
39/**
40 * Your EventManager object will be instantiated and called as such:
41 * EventManager obj = new EventManager(events);
42 * obj.updatePriority(eventId,newPriority);
43 * int param_2 = obj.pollHighest();
44 */