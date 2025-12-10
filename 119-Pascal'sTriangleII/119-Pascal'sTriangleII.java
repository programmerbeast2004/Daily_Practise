// Last updated: 12/10/2025, 11:10:45 PM
1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        List<Integer> row=new ArrayList<>();
4        row.add(1);
5        for(int i=0;i<rowIndex;i++){
6            List<Integer> newRow=new ArrayList<>();
7            newRow.add(1);
8           for (int j = 1; j < row.size(); j++) {
9                newRow.add(row.get(j - 1) + row.get(j));
10            }
11            newRow.add(1);
12            row = newRow;
13        }
14
15        return row;        
16    }
17}