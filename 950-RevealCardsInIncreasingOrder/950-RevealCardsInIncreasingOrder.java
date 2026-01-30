// Last updated: 1/30/2026, 2:30:34 PM
1class Solution {
2    public int[] deckRevealedIncreasing(int[] deck) {
3        Arrays.sort(deck);
4        int n=deck.length;
5        int[] ans=new int[n];
6        Queue<Integer> q=new LinkedList<>();
7        for(int i=0;i<n;i++) q.offer(i);
8        for(int card:deck){
9            ans[q.poll()]=card;
10            if(!q.isEmpty()) q.offer(q.poll());
11        }
12        return ans;
13
14    }
15}