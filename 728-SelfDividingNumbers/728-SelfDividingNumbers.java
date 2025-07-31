// Last updated: 7/31/2025, 12:19:43 PM
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isDivide(i)){
                res.add(i);
            }
        }
        return res;
    }
    public boolean isDivide(int n){
        int num=n;
        while(n>0){
            int rem=n%10;
            if(rem==0||num%rem!=0){
                return false;
            }
            n/=10;
        }
        return true;
    }
}