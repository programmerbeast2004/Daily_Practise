// Last updated: 5/9/2026, 11:26:51 AM
class Solution {
    public int minimumBuckets(String hamsters) {
        char[] arr=hamsters.toCharArray();
        int n=arr.length;
        boolean[] fed=new boolean[n];
        int b=0;
        for(int i=0;i<n;i++){
            if(arr[i]=='H' && !fed[i]){
                if(i+1<n && arr[i+1]=='.'){
                    fed[i]=true;
                    b++;
                    if(i+2<n && arr[i+2]=='H'){
                        fed[i+2]=true;
                    }
                }
                else if(i-1>=0 && arr[i-1]=='.'){
                    fed[i]=true;
                    b++;
                    if(i-2>=0 && arr[i-2]=='H'){
                        fed[i-2]=true;
                    }
                }
                else{
                    return -1;
                }
            }
        }
        return b;
    }
}