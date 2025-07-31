// Last updated: 7/31/2025, 12:19:13 PM
class Solution {
    public String lastSubstring(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length, max = arr[n - 1], ansi = n - 1;
        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                // Found a new maximum character
                max = arr[i];
                ansi = i;
            } else if (arr[i] == max) {
                // Found another occurrence of maximum character
                int x = i + 1, y = ansi + 1;
                
                // Compare the substrings character by character
                while (y < n && x < ansi && arr[x] == arr[y]) {
                    x++;
                    y++;
                }
                
                // Update answer if current substring is lexicographically larger
                if (y == n || x == ansi || arr[x] > arr[y]) {
                    ansi = i;
                }
            }
        }
        
        return s.substring(ansi);
    }
}