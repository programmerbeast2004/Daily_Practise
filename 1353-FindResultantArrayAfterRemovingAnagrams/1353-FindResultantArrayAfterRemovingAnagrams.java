// Last updated: 5/9/2026, 11:28:44 AM
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res=new ArrayList<>();
        String prev="";
        for(String word:words){
            char[] arr=word.toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);

            if(!sorted.equals(prev)){
                res.add(word);
                prev=sorted;
            }
            
        }
        return res;
    }
}