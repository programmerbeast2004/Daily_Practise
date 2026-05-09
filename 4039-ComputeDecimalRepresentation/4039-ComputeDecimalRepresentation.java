// Last updated: 5/9/2026, 11:23:25 AM
class Solution {
    public int[] decimalRepresentation(int n) {
        ArrayList<Integer> temp=new ArrayList<>();
        int pow=0;
        while(n>0){
            int dt=n%10;
            if(dt!=0){
                temp.add(dt*(int)Math.pow(10,pow));
            }
            n/=10;
            pow++;
        }
        Collections.reverse(temp);
        int[] res=new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            res[i]=temp.get(i);
        }
        return res;
    }
}