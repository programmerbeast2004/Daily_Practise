// Last updated: 10/7/2025, 6:56:56 AM
class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> freq=new HashMap<>();
        for(char c:s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>(
            (a,b)->freq.get(b)-freq.get(a)
        );
        pq.addAll(freq.keySet());

        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            char c=pq.poll();
            int ct=freq.get(c);
            for(int i=0;i<ct;i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}