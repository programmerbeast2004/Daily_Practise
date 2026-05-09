// Last updated: 5/9/2026, 11:28:12 AM
class Solution {
    public String arrangeWords(String text) {
        text=text.toLowerCase();
        String[] w=text.split(" ");
        Arrays.sort(w,(a,b)->{
            if(a.length()==b.length()) return 0;
            return a.length()-b.length();
        });
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<w.length;i++){
            if(i==0){
                sb.append(Character.toUpperCase(w[i].charAt(0))).append(w[i].substring(1));
            }
            else{
                sb.append(" ").append(w[i]);
            }
        }
        return sb.toString();
    }
}