// Last updated: 5/9/2026, 11:27:49 AM
class Solution {
    public int minOperations(String[] logs) {
        int d=0;
        for(String log:logs){
            if(log.equals("../")){
                if(d>0)d--;
            }
            else if(!log.equals("./")){
                d++;
            }
        }
        return d;
    }
}