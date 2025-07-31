// Last updated: 7/31/2025, 12:16:40 PM
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        int n = instructions.length;
        long score = 0;
        int i = 0;
        Set<Integer> visited = new HashSet<>();
        
        while (i >= 0 && i < n && !visited.contains(i)) {
            visited.add(i);
            if (instructions[i].equals("add")) {
                score += values[i];
                i++;
            } else if (instructions[i].equals("jump")) {
                i += values[i];
            }
        }
        
        return score;
    }
}
