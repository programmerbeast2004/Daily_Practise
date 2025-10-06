// Last updated: 10/6/2025, 11:01:52 PM
class Solution {
    public boolean winnerOfGame(String colors) {
        int n=colors.length();
        int aliceM=0;
        int bobM=0;
        for(int i=1;i<n-1;i++){
            if(colors.charAt(i)=='A' || colors.charAt(i-1)=='A'||colors.charAt(i+1)=='A') aliceM++;
            if(colors.charAt(i)=='B' || colors.charAt(i-1)=='B'||colors.charAt(i+1)=='B') bobM++;
        }
        return aliceM>bobM;
    }
}