// Last updated: 10/15/2026, 7:00:55 AM
1class Solution {
2    public String maxSumOfSquares(int num, int sum) {
3        if(sum>9*num){
4            return "";
5        }
6        int nine=sum/9;
7        int rem=sum%9;
8
9        StringBuilder sb=new StringBuilder();
10
11        sb.append("9".repeat(nine));
12
13        if(rem>0){
14            sb.append(rem);
15        }
16        sb.append("0".repeat(num-sb.length()));
17        return sb.toString();
18    }
19}