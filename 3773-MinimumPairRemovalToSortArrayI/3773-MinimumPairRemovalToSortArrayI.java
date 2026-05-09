// Last updated: 5/9/2026, 11:23:47 AM
class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int x:nums) list.add(x);
        int c=0;
        while(!Dec(list)){
            int msum=Integer.MAX_VALUE;
            int idx=0;
            for(int i=0;i<list.size()-1;i++){
                int sum=list.get(i)+list.get(i+1);
                if(msum>sum){
                    msum=sum;
                    idx=i;
                }
               
            }
            list.set(idx,msum);
            list.remove(idx+1);
            c++;
        }
        return c;
    }
    public boolean Dec(ArrayList<Integer> list){
        for(int i=1;i<list.size();i++){
            if(list.get(i)<list.get(i-1)){
                return false;
            }
        }
        return true;
    }
}