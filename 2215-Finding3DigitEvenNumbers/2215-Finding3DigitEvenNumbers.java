// Last updated: 5/9/2026, 11:26:46 AM
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer>set=new HashSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i!=j && j!=k && k!=i){
                    int a=digits[i];
                    int b=digits[j];
                    int c=digits[k];
                    if(a!=0 && c%2==0){
                        int res=a*100+b*10+c;
                        set.add(res);
                    }
                    }
                }
            }
        }
        List<Integer> ans=new ArrayList<>(set);
        Collections.sort(ans);
        int[] arr=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        return arr;

    }
}