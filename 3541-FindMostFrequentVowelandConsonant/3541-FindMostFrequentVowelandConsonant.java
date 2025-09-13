// Last updated: 9/13/2025, 8:02:06 AM
class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
        int maxV=0,maxC=0;
        for(char c:s.toCharArray()){
            int i=c-'a';
            freq[i]++;
            if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u'){
                maxV=Math.max(maxV,freq[i]);
            }
            else{
                maxC=Math.max(maxC,freq[i]);
            }
        }
        return(maxV+maxC);
    }
}