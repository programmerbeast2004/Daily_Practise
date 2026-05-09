// Last updated: 5/9/2026, 11:25:09 AM
class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> set=new HashSet<>();
        for(char c:s.toCharArray()){
            set.add(c);
        }
        return set.size();
    }
}