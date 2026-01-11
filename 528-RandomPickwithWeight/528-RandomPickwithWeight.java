// Last updated: 1/11/2026, 9:14:05 AM
1class Solution {
2    int[] pre;
3    int t;
4    Random rand;
5    public Solution(int[] w) {
6        pre=new int[w.length];
7        pre[0]=w[0];
8        for(int i=1;i<w.length;i++){
9            pre[i]=pre[i-1]+w[i];
10        }
11        t=pre[pre.length-1];
12        rand=new Random();
13    }
14    
15    public int pickIndex() {
16        int target=rand.nextInt(t)+1;
17        int l=0,r=pre.length-1;
18        while(l<r){
19            int mid=l+(r-l)/2;
20            if(pre[mid]<target){
21                l=mid+1;
22            }
23            else{
24                r=mid;
25            }
26        }
27        return l;
28    }
29}
30
31/**
32 * Your Solution object will be instantiated and called as such:
33 * Solution obj = new Solution(w);
34 * int param_1 = obj.pickIndex();
35 */