// Last updated: 5/9/2026, 11:30:16 AM
class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int n=s.length();
        int[] m=new int[n];
        java.util.Arrays.fill(m,-1);
        for(int i=0;i<indices.length;i++){
            if(s.startsWith(sources[i],indices[i])){
                m[indices[i]]=i;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;){
            if(m[i]!=-1){
                ans.append(targets[m[i]]);
                i+=sources[m[i]].length();
            }
            else{
                ans.append(s.charAt(i));
                i++;
            }
        }
        return ans.toString();

    }
}