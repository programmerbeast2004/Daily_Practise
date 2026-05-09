// Last updated: 5/9/2026, 11:25:30 AM
class Solution {
    public long makeSubKSumEqual(int[] arr, int k) {
        int n=arr.length;
        boolean[] v=new boolean[n];
        long ans=0;

        for(int i=0;i<n;i++){
            if(!v[i]){
                ArrayList<Integer>g=new ArrayList<>();
                for(int j=i;!v[j];j=(j+k)%n){
                    v[j]=true;
                    g.add(arr[j]);
                }
                Collections.sort(g);
                int m=g.get(g.size()/2);
                for(int x:g) ans+=Math.abs(x-m);
            }
        }
        return ans;
    }
}