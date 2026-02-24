// Last updated: 2/24/2026, 4:09:49 PM
1class Solution {
2    public int[] findEvenNumbers(int[] digits) {
3        HashSet<Integer>set=new HashSet<>();
4        int n=digits.length;
5        for(int i=0;i<n;i++){
6            for(int j=0;j<n;j++){
7                for(int k=0;k<n;k++){
8                    if(i!=j && j!=k && k!=i){
9                    int a=digits[i];
10                    int b=digits[j];
11                    int c=digits[k];
12                    if(a!=0 && c%2==0){
13                        int res=a*100+b*10+c;
14                        set.add(res);
15                    }
16                    }
17                }
18            }
19        }
20        List<Integer> ans=new ArrayList<>(set);
21        Collections.sort(ans);
22        int[] arr=new int[ans.size()];
23        for(int i=0;i<ans.size();i++){
24            arr[i]=ans.get(i);
25        }
26        return arr;
27
28    }
29}