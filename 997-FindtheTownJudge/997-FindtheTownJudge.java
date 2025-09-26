// Last updated: 9/26/2025, 8:20:31 PM
class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1){
            return 1;
        }
        int count[]=new int[n+1];
        for(int[] i:trust){
            count[i[0]]--;
            count[i[1]]++;
        }
        for(int j=0;j<count.length;j++){
            if(count[j]==n-1){
                return j;
            }
        }
        return -1;
    }
}