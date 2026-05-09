// Last updated: 5/9/2026, 11:22:14 AM
class Solution {
public:
    int firstMatchingIndex(string s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s[i]==s[n-i-1]){
                return i;
            }
        }
        return -1;
    }
};