// Last updated: 7/31/2025, 12:19:08 PM
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
   int arr[] = new int[num_people];
        int s = 1;
        while (candies > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (candies - s >= 0) {
                    arr[i] += s;
                    candies -= s;
                    if (candies == 0)
                        break;
                    s++;
                } else {
                    arr[i] += candies;
                    candies = 0;
                }
            }
        }
        return arr;
    }
}