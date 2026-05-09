// Last updated: 5/9/2026, 11:29:52 AM
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int[] l=new int[n];
        int[] r=new int[n];
        //left
        Stack<int[]> st1=new Stack<>();
        for(int i=0;i<n;i++){
            int c=1;
            while(!st1.isEmpty()&& st1.peek()[0]>arr[i]){
                c+=st1.pop()[1];
            }
            st1.push(new int[] {arr[i],c});
            l[i]=c;
        }

        //right
        Stack<int[]> st2=new Stack<>();
        for(int i=n-1;i>=0;i--){
            int c=1;
            while(!st2.isEmpty() && st2.peek()[0]>=arr[i]){
                c+=st2.pop()[1];
            }
            st2.push(new int[] {arr[i],c});
            r[i]=c;
        }
        long ans=0;
        int MOD=1000000007;
        for(int i=0;i<n;i++){
            ans = (ans + (long) arr[i] * l[i] * r[i]) % MOD;
        }
        return (int)ans;


    }
}