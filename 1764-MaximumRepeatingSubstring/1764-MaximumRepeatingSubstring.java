// Last updated: 5/9/2026, 11:27:45 AM
class Solution {
    public int maxRepeating(String seq, String word) {
        StringBuilder sb=new StringBuilder(word);
        int c=0;
        while(seq.contains(sb.toString())){
            c++;
            sb.append(word);
        }
        return c;
    }
}