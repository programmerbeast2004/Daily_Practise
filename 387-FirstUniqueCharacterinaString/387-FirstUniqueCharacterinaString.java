// Last updated: 1/30/2026, 7:58:27 AM
1class Solution {
2    public int firstUniqChar(String s) {
3        int n=s.length();
4        int[] freq=new int[26];
5        Queue<Integer> q=new LinkedList<>();
6        for(int i=0;i<n;i++){
7            int ch=s.charAt(i)-'a';
8            freq[ch]++;
9            q.offer(i);
10        }
11        while(!q.isEmpty() && freq[s.charAt(q.peek())-'a']>1){
12            q.poll();
13        }
14        return q.isEmpty() ? -1 :q.peek();
15
16    }
17}