// Last updated: 5/9/2026, 11:22:49 AM
class Solution {
    public int minLength(int[] n, int k) {
        int l=0;
        int s=0;
        int minLen=Integer.MAX_VALUE;
        Map<Integer,Integer> map=new HashMap<>();
        for(int r=0;r<n.length;r++){
            // while(set.contains(n[r])){
            //     set.remove(n[l]);
            //     s=s-n[l];
            //     l++;
            // }
            // set.add(n[r]);
            // s=s+n[r];
            // while(s>=k){
            //     minLen=Math.min(minLen,r-l+1);
            //     set.remove(n[l]);
            //     s=s-n[l];
            //     l++;
            // }
            map.put(n[r],map.getOrDefault(n[r],0)+1);
            if(map.get(n[r])==1){
                s+=n[r];
            }
            while(s>=k){
                minLen=Math.min(minLen,r-l+1);
                map.put(n[l],map.get(n[l])-1);
                if(map.get(n[l])==0){
                    s-=n[l];
                }
                l++;
            }
        }
        if(minLen==Integer.MAX_VALUE){
            return -1;
        }
        return minLen;
    }
}