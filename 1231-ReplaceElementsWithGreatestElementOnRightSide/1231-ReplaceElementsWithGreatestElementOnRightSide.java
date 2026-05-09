// Last updated: 5/9/2026, 11:29:02 AM
class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int max=-1;
        for(int i=n-1;i>=0;i--){
            int curr=arr[i];
            arr[i]=max;
            max=Math.max(max,curr);
        }
        return arr;
    }
}