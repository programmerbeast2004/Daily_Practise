// Last updated: 5/9/2026, 11:22:47 AM
class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        String v="aeiou";
        int r=0;
        for(char c:words[0].toCharArray()){
            if(v.indexOf(c)!=-1){
                r++;
            }
        }
        for(int i=1;i<words.length;i++){
            int ct=0;
            for(char c:words[i].toCharArray()){
                if(v.indexOf(c)!=-1){
                    ct++;
                }
            }
        
            if(ct==r){
                words[i]=new StringBuilder(words[i]).reverse().toString();
            }
        }
    return String.join(" ", words);
}
}