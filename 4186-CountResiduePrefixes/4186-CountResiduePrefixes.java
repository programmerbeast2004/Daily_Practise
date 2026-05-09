// Last updated: 5/9/2026, 11:22:35 AM
class Solution {
    public int residuePrefixes(String s) {
        boolean[] seen=new boolean[26];
        int dist=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!seen[ch-'a']){
                seen[ch-'a']=true;
                dist++;
            }
            int len=i+1;
            if(dist==len%3){
                ans++;
            }
        }
        return ans;
    }
}