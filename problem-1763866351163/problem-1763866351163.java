// Last updated: 11/23/2025, 8:22:31 AM
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