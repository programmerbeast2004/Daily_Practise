// Last updated: 3/29/2026, 8:21:25 AM
1class Solution {
2public:
3    int firstMatchingIndex(string s) {
4        int n=s.length();
5        for(int i=0;i<n;i++){
6            if(s[i]==s[n-i-1]){
7                return i;
8            }
9        }
10        return -1;
11    }
12};