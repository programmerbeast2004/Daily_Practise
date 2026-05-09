// Last updated: 5/9/2026, 11:24:03 AM
class Solution {
    public boolean isBalanced(String num) {
        //int n=Integer.parseInt(num);
        //System.out.println(num);
        //return true;
        int s1=0,s2=0;
        for(int i=0;i<num.length();i++){
            
            int dt=num.charAt(i)-'0';
            if(i%2==0){
                s1+=dt;
            }
            else{
                s2+=dt;
            }
        }
        return s1==s2;

    }
}