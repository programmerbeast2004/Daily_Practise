// Last updated: 10/14/2025, 6:52:13 AM
import java.util.*;

class Solution {
    public String frequencySort(String s) {
        // Step 1: Count frequency
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Step 2: Convert string to character array
        Character[] chars = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        // Step 3: Sort characters by decreasing frequency
        Arrays.sort(chars, (a, b) -> {
            int f1 = freq.get(b) - freq.get(a); // higher frequency first
            if (f1 == 0) return a - b; // if same freq, sort lexicographically
            return f1;
        });

        // Step 4: Build the result
        StringBuilder sb = new StringBuilder();
        for (char c : chars) sb.append(c);

        return sb.toString();
    }
}
