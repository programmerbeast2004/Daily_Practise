// Last updated: 1/23/2026, 11:46:07 PM
1class Solution {
2    public boolean isItPossible(String word1, String word2) {
3        int[] f1=new int[26];
4        int[] f2=new int[26];
5
6        for(char c:word1.toCharArray()) f1[c-'a']++;
7        for(char c:word2.toCharArray()) f2[c-'a']++;
8
9        for(int i=0;i<26;i++){
10            for(int j=0;j<26;j++){
11                if(f1[i]==0 || f2[j]==0) continue;
12                f1[i]--;
13                f2[j]--;
14                f1[j]++;
15                f2[i]++;
16                if(dist(f1)==dist(f2)) return true;
17                f1[j]--;
18                f2[i]--;
19                f1[i]++;
20                f2[j]++;
21            }
22        }
23        return false;
24    }
25    private int dist(int[] freq){
26        int c=0;
27        for(int f:freq){
28            if(f>0) c++;
29        }
30        return c;
31    }
32}