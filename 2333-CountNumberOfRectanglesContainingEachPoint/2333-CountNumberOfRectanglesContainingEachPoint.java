// Last updated: 5/9/2026, 11:26:24 AM
class Solution {
    public int[] countRectangles(int[][] rectangles, int[][] points) {
        List<Integer>[] map=new ArrayList[101];
        for (int i = 0; i <= 100; i++) map[i] = new ArrayList<>();
        for (int[] r : rectangles) {
            map[r[1]].add(r[0]);
        }
        for(int i=0;i<=100;i++){
            Collections.sort(map[i]);
        }
        int[] ans=new int[points.length];
        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];
            int count=0;
            for(int h=y;h<=100;h++){
                List<Integer> list=map[h];
                int idx=Collections.binarySearch(list,x);
                if(idx<0) idx=-idx-1;
                count+=list.size()-idx;
            }
            ans[i]=count;
        }
        return ans;
    }
}