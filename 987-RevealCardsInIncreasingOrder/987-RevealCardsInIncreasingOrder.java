// Last updated: 5/9/2026, 11:29:34 AM
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n=deck.length;
        int[] ans=new int[n];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++) q.offer(i);
        for(int card:deck){
            ans[q.poll()]=card;
            if(!q.isEmpty()) q.offer(q.poll());
        }
        return ans;

    }
}