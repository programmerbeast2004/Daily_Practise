// Last updated: 9/29/2025, 3:13:05 PM
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int l=j-i+1;
                if(l%2!=0){
                    for(int k=i;k<=j;k++){
                        sum+=arr[k];
                    }
                }
            }
            
        }
        return sum;
    }
}