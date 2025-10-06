// Last updated: 10/6/2025, 8:10:27 AM
class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n=flowers.length;
        int[] start=new int[n];
        int[] end=new int[n];
        for(int i=0;i<n;i++){
            start[i]=flowers[i][0];
            end[i]=flowers[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int[] ans = new int[people.length];
        for(int i=0;i<people.length;i++){
            int day=people[i];
            int started=upperBound(start,day);
            int ended=lowerBound(end,day);
            ans[i]=started-ended;
        }
        return ans;
    }
    public int upperBound(int[] arr, int target){
        int l=0, r=arr.length;
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]<=target){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return l;
    }
    public int lowerBound(int[] arr, int target){
        int l=0, r=arr.length;
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]<target){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return l;
    }
}