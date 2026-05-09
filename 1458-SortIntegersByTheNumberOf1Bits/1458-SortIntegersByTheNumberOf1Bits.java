// Last updated: 5/9/2026, 11:28:29 AM
class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        Integer[]num=new Integer[n];
        for(int i=0;i<n;i++){
            num[i]=arr[i];
        }
        Arrays.sort(num,(a,b)->{
            int ca=Integer.bitCount(a);
            int cb=Integer.bitCount(b);
            if(ca==cb){
                return a-b;
            }
            return ca-cb;
        });
        for(int i=0;i<n;i++){
            arr[i]=num[i];
        }
        return arr;
    }
}