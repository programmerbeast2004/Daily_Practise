// Last updated: 10/1/2025, 3:18:03 PM
class Solution {
    public void moveZeroes(int[] arr) {
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[idx]=arr[i];
                idx++;
            }
        }
        for(int i=idx;i<arr.length;i++){
            arr[i]=0;
        }
    }
}