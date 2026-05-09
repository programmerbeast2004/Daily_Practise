// Last updated: 5/9/2026, 11:22:12 AM
class EventManager {
    private Map<Integer,Integer>map;
    private PriorityQueue<int[]>pq;
    public EventManager(int[][] events) {
        map=new HashMap<>();
        pq=new PriorityQueue<>((a,b)->{
            if(b[0]!=a[0])return b[0]-a[0];
            return a[1]-b[1];
        });
        for(int[]e:events){
            int id=e[0],pr=e[1];
            map.put(id,pr);
            pq.offer(new int[]{pr,id});
        }
    }
    
    public void updatePriority(int eventId, int newPriority) {
        map.put(eventId,newPriority);
        pq.offer(new int[]{newPriority,eventId});
    }
    
    public int pollHighest() {
        while(!pq.isEmpty()){
            int[]top=pq.peek();
            int pr=top[0];
            int id=top[1];
            if(map.containsKey(id)&& map.get(id)==pr){
                pq.poll();
                map.remove(id);
                return id;
            }
            pq.poll();
        }
        return -1;
        
    }
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */