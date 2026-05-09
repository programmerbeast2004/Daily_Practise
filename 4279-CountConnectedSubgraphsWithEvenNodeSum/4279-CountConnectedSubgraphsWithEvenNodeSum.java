// Last updated: 5/9/2026, 11:22:03 AM
class Solution {
    public int evenSumSubgraphs(int[] nums, int[][] edges) {
        int n=nums.length;
        List<Integer>[]g=new ArrayList[n];
        for(int i=0;i<n;i++)g[i]=new ArrayList<>();
        for(int[]e:edges){
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }
        int c=0;
        for(int m=1;m<(1<<n);m++){
            int s=0;
            int fn=-1;
            for(int i=0;i<n;i++){
                if((m &(1<<i))!=0){
                    s+=nums[i];
                    if(fn==-1)fn=i;
                }
            }
            if(s%2!=0)continue;
            boolean[]vis=new boolean[n];
            Queue<Integer>q=new LinkedList<>();
            q.add(fn);
            vis[fn]=true;
            while(!q.isEmpty()){
                int cur=q.poll();
                for(int ni:g[cur]){
                    if((m &(1<<ni))!=0 &&!vis[ni]){
                        vis[ni]=true;
                        q.add(ni);
                    }
                }
            }
            boolean isCon=true;
            for(int i=0;i<n;i++){
                if((m&(1<<i))!=0 &&!vis[i]){
                    isCon=false;
                    break;
                }
            }
            if(isCon)c++;
            
        }
        return c;
    }
}