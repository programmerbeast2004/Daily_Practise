// Last updated: 5/9/2026, 11:30:01 AM
class Solution {
    int[] pre;
    int t;
    Random rand;
    public Solution(int[] w) {
        pre=new int[w.length];
        pre[0]=w[0];
        for(int i=1;i<w.length;i++){
            pre[i]=pre[i-1]+w[i];
        }
        t=pre[pre.length-1];
        rand=new Random();
    }
    
    public int pickIndex() {
        int target=rand.nextInt(t)+1;
        int l=0,r=pre.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(pre[mid]<target){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return l;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */