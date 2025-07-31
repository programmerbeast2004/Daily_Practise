// Last updated: 7/31/2025, 12:19:01 PM
import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);  // Step 1: sort the array
        List<Integer> freqList = new ArrayList<>();
        
        int i = 0;
        while (i < arr.length) {
            int count = 1;
            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }
            freqList.add(count);
            i++;
        }

        Collections.sort(freqList);  // Step 3: sort frequency list

        // Step 4: check for duplicate frequencies
        for (int j = 1; j < freqList.size(); j++) {
            if (freqList.get(j).equals(freqList.get(j - 1))) {
                return false;
            }
        }

        return true;
    }
}
