// Last updated: 5/9/2026, 11:22:50 AM
class Solution {
    public int[] sortByReflection(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int r1=ref(arr[i]);
                int r2=ref(arr[j]);
                if(r1>r2 ||r1==r2 && arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
           
        }
        return arr;
    }
    public int ref(int n){
        int rev=0;
        while(n>0){
            int bit=n%2;
            rev=rev*2+bit;
            n=n/2;
        }
        return rev;
    }
}