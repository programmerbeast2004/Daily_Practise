// Last updated: 2/3/2026, 1:46:23 PM
1class Solution {
2    public int minimumPairRemoval(int[] nums) {
3        ArrayList<Integer> list=new ArrayList<>();
4        for(int x:nums) list.add(x);
5        int c=0;
6        while(!Dec(list)){
7            int msum=Integer.MAX_VALUE;
8            int idx=0;
9            for(int i=0;i<list.size()-1;i++){
10                int sum=list.get(i)+list.get(i+1);
11                if(msum>sum){
12                    msum=sum;
13                    idx=i;
14                }
15               
16            }
17            list.set(idx,msum);
18            list.remove(idx+1);
19            c++;
20        }
21        return c;
22    }
23    public boolean Dec(ArrayList<Integer> list){
24        for(int i=1;i<list.size();i++){
25            if(list.get(i)<list.get(i-1)){
26                return false;
27            }
28        }
29        return true;
30    }
31}