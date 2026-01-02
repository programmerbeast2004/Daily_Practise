// Last updated: 1/2/2026, 8:12:55 AM
1class Solution {
2    public int[] sortEvenOdd(int[] nums) {
3        List<Integer> even=new ArrayList<>();
4        List<Integer> odd=new ArrayList<>();
5        for(int i=0;i<nums.length;i++){
6            if(i%2==0){
7                even.add(nums[i]);
8            }
9            else{
10                odd.add(nums[i]);
11            }
12        }
13        Collections.sort(even);
14        Collections.sort(odd,Collections.reverseOrder());
15        int e=0, o=0;
16        for(int i=0;i<nums.length;i++){
17            if(i%2==0){
18                nums[i]=even.get(e++);
19            }
20            else{
21                nums[i]=odd.get(o++);
22            }
23        }
24        return nums;
25
26    }
27}