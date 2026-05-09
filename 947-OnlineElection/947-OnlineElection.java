// Last updated: 5/9/2026, 11:29:47 AM
class TopVotedCandidate {
    int[]times;
    int[]leaders;
    public TopVotedCandidate(int[] persons, int[] times) {
        this.times=times;
        leaders=new int[persons.length];
        Map<Integer,Integer>map=new HashMap<>();
        int leader=-1;
        int max=0;
        for(int i=0;i<persons.length;i++){
            int p=persons[i];
            map.put(p,map.getOrDefault(p,0)+1);
            if(map.get(p)>=max){
                max=map.get(p);
                leader=p;
            }
            leaders[i]=leader;
        }
    }
    
    public int q(int t) {
        int i=0;
        while(i<times.length && times[i]<=t){
            i++;
        }
        return leaders[i-1];
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */