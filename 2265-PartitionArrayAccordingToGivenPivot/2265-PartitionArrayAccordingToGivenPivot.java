// Last updated: 7/31/2025, 12:18:05 PM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int[] less=new int[n],high=new int[n],result=new int[n];
        int c=0,i=0,j=0;
        for(int num:nums){
            if(num<pivot) less[i++]=num;
            else if(num==pivot)c++;
            else high[j++]=num;
        }
        int index=0;
        for(int a=0;a<i;a++) result[index++]=less[a];
        for(int a=0;a<c;a++) result[index++]=pivot;
        for(int a=0;a<j;a++) result[index++]=high[a];
        return result;
    }
}