// Last updated: 5/9/2026, 11:23:38 AM
class Solution {
    public String generateTag(String caption) {
        String[] w=caption.trim().split("\\s+");
        StringBuilder sb=new StringBuilder("#");
        for(int i=0;i<w.length;i++){
            String c=w[i];
            if(c.isEmpty()) continue;
            c=c.toLowerCase();
            if(i==0){
                sb.append(c);
            }
            else{
                sb.append(Character.toUpperCase(c.charAt(0)));
                if(c.length()>1){
                    sb.append(c.substring(1));
                }
            }
            if(sb.length()>=100) break;
        }
        return sb.length()>100 ?sb.substring(0,100):sb.toString();
    }
}