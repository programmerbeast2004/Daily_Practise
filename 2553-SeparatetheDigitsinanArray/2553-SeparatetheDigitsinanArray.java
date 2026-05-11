// Last updated: 5/11/2026, 7:40:34 PM
1class Solution {
2    public int[] separateDigits(int[] nums) {
3        List<Integer>lis=new ArrayList<>();
4        for(int num:nums){
5            String s=String.valueOf(num);
6            for(char ch:s.toCharArray()){
7                lis.add(ch-'0');
8            }
9        }
10        int[]res=new int[lis.size()];
11        for(int i=0;i<lis.size();i++){
12            res[i]=lis.get(i);
13        }
14        return res;
15    }
16}