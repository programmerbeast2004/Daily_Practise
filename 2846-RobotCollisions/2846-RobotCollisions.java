// Last updated: 5/9/2026, 11:25:04 AM
class Solution {
    public List<Integer> survivedRobotsHealths(int[] pos, int[] h, String d) {
        int n=pos.length;
        Integer[]idx=new Integer[n];
        for(int i=0;i<n;i++)idx[i]=i;

        Arrays.sort(idx,(a,b)->pos[a]-pos[b]);

        boolean[]alive=new boolean[n];
        Arrays.fill(alive,true);

        Deque<Integer>st=new ArrayDeque<>();

        for(int i:idx){
            if(d.charAt(i)=='R'){
                st.push(i);
            }
            else{
                while(!st.isEmpty()){
                    int top=st.peek();
                    if (h[top] < h[i]) {
                        alive[top]=false;
                        st.pop();     // R dies
                        h[i]--;       // L loses 1
                    }
                    else if (h[top] > h[i]) {
                        alive[i]=false;
                        h[top]--;       // R loses 1
                        break;    // L dies
                    }
                    else {
                        alive[top]=false;
                        alive[i]=false;
                        st.pop();     // both die
                        break;
                    }
                }
            }
        }
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<n;i++) if(alive[i]) res.add(h[i]);
        return res;
    }
}