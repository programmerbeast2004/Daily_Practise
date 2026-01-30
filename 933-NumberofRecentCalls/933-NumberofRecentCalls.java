// Last updated: 1/30/2026, 8:09:37 AM
1class RecentCounter {
2    Queue<Integer> q;
3    public RecentCounter() {
4        q=new LinkedList<>();
5    }
6    
7    public int ping(int t) {
8        q.offer(t);
9        while(q.peek()<t-3000){
10            q.poll();
11        }
12        return q.size();
13    }
14}
15
16/**
17 * Your RecentCounter object will be instantiated and called as such:
18 * RecentCounter obj = new RecentCounter();
19 * int param_1 = obj.ping(t);
20 */