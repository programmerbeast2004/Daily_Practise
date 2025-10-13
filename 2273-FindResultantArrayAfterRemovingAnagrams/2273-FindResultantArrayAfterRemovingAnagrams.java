// Last updated: 10/13/2025, 6:33:22 AM
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