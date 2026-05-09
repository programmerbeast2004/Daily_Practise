// Last updated: 5/9/2026, 11:26:47 AM
class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> res=new ArrayList<>();
        int n=security.length;
        int[] l =new int[n];
        int[] r= new int[n];
        for(int i=1;i<n;i++){
            if(security[i]<=security[i-1]){
                l[i]=l[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(security[i]<=security[i+1]){
                r[i]=r[i+1]+1;
            }
        }
        for(int i=time;i<n-time;i++){
            if(l[i]>=time && r[i]>=time){
                res.add(i);
            }
        }
        return res;
    }
}