// Last updated: 10/1/2025, 11:29:50 AM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i=0;
        int j=0;
        int c=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<g.length && j<s.length){
        if(s[j]>=g[i]){
            i++;
            j++;
            c++;
        }
        else{
            j++;
        }
        }
        return c;
    }
}