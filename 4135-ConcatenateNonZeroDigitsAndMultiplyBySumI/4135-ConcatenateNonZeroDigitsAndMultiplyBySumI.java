// Last updated: 5/9/2026, 11:22:57 AM
class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb=new StringBuilder();
        for(char c:String.valueOf(n).toCharArray()){
            if(c!='0') sb.append(c);
        }
        if(sb.length()==0) return 0;
        long x=Long.parseLong(sb.toString());
        long sum=0,t=x;
        while(t>0){
            sum+=t%10;
            t/=10;
        }
        return x*sum;
    }
}