// Last updated: 5/9/2026, 11:29:36 AM
class Solution {
    public String largestTimeFromDigits(int[] arr) {
        int h1=-1, h2=-1,m1=-1,m2=-1;
        Arrays.sort(arr);
        for(int h=23;h>=0;h--){
            for(int m=59;m>=0;m--){
                h1=h/10;
                h2=h%10;
                m1=m/10;
                m2=m%10;

                int[] t={h1,h2,m1,m2};
                Arrays.sort(t);
                if(Arrays.equals(arr,t)){
                    return h1+""+h2+":"+m1+""+m2;
                }
            }
        }
        return "";
    }
}