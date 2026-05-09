// Last updated: 5/9/2026, 11:23:35 AM
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        int[] check=nums;
        Arrays.sort(check);
        int[] result=new int[k];
        int c=0;
        for(int i=check.length-1;i>=0 && c<k;i--){
            boolean dup=false;
            for(int j=0;j<c;j++){
                if(result[j]==check[i]){
                    dup=true;
                    break;
                }
            }
            if(!dup){
                result[c]=check[i];
                c++;
            }
        }
        return Arrays.copyOf(result,c);
    }
}