// Last updated: 10/7/2025, 6:04:25 AM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;

        int[] freq1=new int[26];
        int[] freq2=new int[26];

        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length()-s1.length();i++){
            if (matches(freq1, freq2)) return true;
            freq2[s2.charAt(i)-'a']--;
            freq2[s2.charAt(i+s1.length())-'a']++;
        }
        return matches(freq1,freq2);
    }
    public boolean matches(int[] a, int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}