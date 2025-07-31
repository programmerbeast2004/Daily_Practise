// Last updated: 7/31/2025, 12:19:31 PM
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int s1=0,s2=0;
        int[] ans= new int[2];
        for(int i:aliceSizes){
            s1+=i;
        }
        for(int j:bobSizes){
            s2+=j;
        }
        int diff=(s1-s2)/2;
        Arrays.sort(aliceSizes);
        for(int num:bobSizes){
            if (Binary(aliceSizes,num+diff)!=-1) return new int[]{num+diff,num};
        }
        return null;
    }
    public int Binary(int[] arr,int t){
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]<t) s=mid+1;
            else if(arr[mid]>t) e=mid-1;
            else return mid;
        }
        return -1;
    }
}