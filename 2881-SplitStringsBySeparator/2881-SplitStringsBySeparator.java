// Last updated: 5/9/2026, 11:25:03 AM
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String>res=new ArrayList<>();
        for(String word:words){
            String[] parts=word.split("\\"+separator);
            for(String p:parts){
                if(!p.isEmpty()){
                    res.add(p);
                }
            }

        }
        return res;
    }
}