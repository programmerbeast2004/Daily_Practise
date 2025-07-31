// Last updated: 7/31/2025, 12:18:22 PM
class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)) s=s.replaceFirst(part,"");
            return s;
    }
}