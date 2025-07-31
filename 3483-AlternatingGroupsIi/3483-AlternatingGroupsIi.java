// Last updated: 7/31/2025, 12:16:52 PM
class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        // int cnt = 1;
        // int res = 0;
        // int firstcnt = 0;
        // for (int i = 1; i < colors.length; i++) {
        //     if (colors[i] != colors[i-1]) cnt++;
        //     else {
        //         if (firstcnt == 0) firstcnt = Math.min(k-1, cnt); 
        //         cnt = 1;
        //     }
        //     if (cnt >= k) res++;
        // }
        // if (colors[colors.length-1] == colors[0]) cnt = -1000;
        // if (cnt == colors.length) return cnt;
        // return res + Math.max(0, firstcnt + Math.min(cnt, k-1) - k + 1);

        int cnt =1;
        int firstcnt=0;
        int ans =0;
        for(int i =1;i<colors.length;i++){
            if(colors[i]!=colors[i-1])cnt++;
            else{
                if(firstcnt==0){
                    firstcnt =Math.min(k-1,cnt);
                }
                cnt =1;
            }     
          if(cnt>=k) ans++;     
        }
        if(colors[colors.length-1] ==colors[0]) cnt =-1000;
        if(cnt==colors.length)return cnt;
        return ans+  Math.max(0,firstcnt+Math.min(cnt,k-1)-k+1);
    }
}