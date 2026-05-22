// Last updated: 5/22/2026, 8:08:40 AM
1class Solution {
2    public double average(int[] salary) {
3        Arrays.sort(salary);
4        int sum=0;
5        for(int i=1;i<salary.length-1;i++){
6            sum+=salary[i];
7        }
8        return (double)sum/(salary.length-2);
9    }
10}