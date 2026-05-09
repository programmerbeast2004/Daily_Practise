// Last updated: 5/9/2026, 11:24:51 AM
class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        ArrayList<String> res=new ArrayList<>();
        res.add(words[0]);
        for(int i=1;i<words.length;i++){
            if(i>0){
                if(groups[i]!=groups[i-1]){
                    res.add(words[i]);
                }
            }
        }
        return res;
        
    }
}