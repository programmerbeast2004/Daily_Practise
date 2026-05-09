// Last updated: 5/9/2026, 11:30:49 AM
class Solution {
    public String longestWord(String[] words) {

        // 1. Priority Queue (longest first, lexicographically smallest if tie)
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return b.length() - a.length();
        });

        // 2. HashSet for prefix checking
        HashSet<String> set = new HashSet<>();

        for (String word : words) {
            set.add(word);
            pq.offer(word);
        }

        // 3. Process words
        while (!pq.isEmpty()) {
            StringBuilder sb = new StringBuilder(pq.poll());
            String result = sb.toString();

            // 4. Check prefixes
            while (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
                if (sb.length() > 0 && !set.contains(sb.toString())) {
                    break;
                }
            }

            // 5. Valid word found
            if (sb.length() == 0) {
                return result;
            }
        }

        return "";
    }
}
