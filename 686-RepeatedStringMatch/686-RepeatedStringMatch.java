// Last updated: 5/9/2026, 11:30:55 AM
class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int c=-0;
        while(sb.length()<b.length()){
            sb.append(a);
            c++;
        }
        if (sb.indexOf(b) != -1) {
            return c;
        }

        sb.append(a);
        c++;

        if (sb.indexOf(b) != -1) {
            return c;
        }

        return -1;
    }
}