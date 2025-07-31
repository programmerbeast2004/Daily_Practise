// Last updated: 7/31/2025, 12:18:37 PM
class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n=arr.length;
        int cr=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if((Math.abs(arr[i]-arr[j])<=a)&&(Math.abs(arr[j]-arr[k])<=b)&&(Math.abs(arr[i]-arr[k])<=c)){
                        cr++;
                    }
                }
            }
        }
        return cr;
    }
}