// Last updated: 12/6/2025, 8:38:07 PM
1class Solution {
2    public int[] minOperations(int[] nums) {
3        int[] res=new int[nums.length];
4        for(int i=0;i<nums.length;i++){
5            res[i]=minFD(nums[i]);
6        }
7        return res;
8    }
9    private int minFD(int n){
10        if(minF(n)) return 0;
11        int d=1;
12        while(true){
13            if(n-d >=0 && minF(n-d)) return d;
14            if(minF(n+d)) return d;
15            d++;
16        }
17    }
18    private boolean minF(int n){
19        String bin=Integer.toBinaryString(n);
20        int l=0,r=bin.length()-1;
21        while(l<r){
22            if(bin.charAt(l++)!=bin.charAt(r--))return false;
23        }
24        return true;
25    }
26}