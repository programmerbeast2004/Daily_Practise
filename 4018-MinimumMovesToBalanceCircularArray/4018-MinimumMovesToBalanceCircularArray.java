// Last updated: 5/9/2026, 11:23:30 AM
class Solution {
    public long minMoves(int[] balance) {
        long s=0;
        for(int x:balance) s+=x;
        if(s<0)return -1;
        int n=balance.length;
        int idx=-1;
        for(int i=0;i<n;i++){
            if(balance[i]<0){
                idx=i;
                break;
            }
        }
        if(idx==-1) return 0;
        long req=-balance[idx];

        List<int[]>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(balance[i]>0){
                int d=Math.abs(i-idx);
                int dist=Math.min(d,n-d);
                list.add(new int[]{dist,balance[i]});
            }
        }
        Collections.sort(list,(a,b)->a[0]-b[0]);
        long a=0;
        for(int[] p:list){
            if(req==0) break;
            long t=Math.min((long)p[1],req);
            a+=t*p[0];
            req-=t;
        }
        return a;
    }
}