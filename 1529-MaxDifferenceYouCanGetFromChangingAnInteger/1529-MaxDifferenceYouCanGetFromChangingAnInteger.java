// Last updated: 7/31/2025, 12:18:43 PM
class Solution {
    public int maxDiff(int num) {
        int min=Integer.MAX_VALUE;
        int max=0;
        String s=Integer.toString(num);
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                String res=change(s,i,j);
                if(res.charAt(0)!='0'){
                    int r=Integer.parseInt(res);
                    min=Math.min(min,r);
                    max=Math.max(max,r);
                }
            }
        }
        return max-min;
    }
    public static String change(String s,int x,int j){
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if((sb.charAt(i)-'0')==x){
                sb.setCharAt(i,(char)('0'+j));
            }
        }
        return sb.toString();
    }
}