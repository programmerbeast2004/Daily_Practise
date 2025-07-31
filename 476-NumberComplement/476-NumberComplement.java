// Last updated: 7/31/2025, 12:20:05 PM
class Solution {
    public int findComplement(int num) {
       String toBinary=Integer.toBinaryString(num);
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<toBinary.length();i++){
        if(toBinary.charAt(i)=='0') sb.append('1');
        else sb.append('0');
       }
       return Integer.parseInt(sb.toString(),2);
    }
}