// Last updated: 10/5/2025, 8:03:44 PM
class Solution {
    public boolean isMatch(String s, String p) {
        int n=s.length();
        int m=p.length();
        Boolean[][] dp= new Boolean[n+1][m+1];
        return WildCardRec(s,n,p,m,dp);
    }
    public boolean WildCardRec(String s,int n, String p,int m, Boolean[][]dp){
        //Empty pattern match with only empty string
        if(m==0){
            return(n==0);
        }
        if(dp[n][m]!=null)return dp[n][m];
        //Empty text can match with pattern only with '*'
        if(n==0){
            for(int i=0;i<m;i++){
                if(p.charAt(i)!='*') return dp[n][m]=false;
            }
            return dp[n][m]=true;
        }
        boolean ans;
        // '?' aagya hai toh check each of the string and move forward with it
        if(s.charAt(n-1)==p.charAt(m-1) || p.charAt(m-1)=='?')
        ans=WildCardRec(s,n-1,p,m-1,dp);
        //'*' aagya hai two cases honge
        // 1st -match with empty character
        //2nd- match with so many characters
        else if(p.charAt(m-1)=='*'){
        ans=WildCardRec(s,n,p,m-1,dp) || WildCardRec(s,n-1,p,m,dp);
        }
        else{
        ans=false;
        }
        return dp[n][m]=ans;
    }
    
}