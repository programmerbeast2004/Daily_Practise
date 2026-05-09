// Last updated: 5/9/2026, 11:27:31 AM
class Solution {
    public int minOperations(String s) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                s1.append("0");
                s2.append("1");
            }
            else{
                s1.append("1");
                s2.append("0");
            }
        }
            int c1=0,c2=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=s1.charAt(i))c1++;
                if(s.charAt(i)!=s2.charAt(i))c2++;
            }
            return Math.min(c1,c2);
        }

    }
