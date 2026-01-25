// Last updated: 1/25/2026, 8:04:00 PM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        Arrays.sort(nums1);
4        Arrays.sort(nums2);
5        int i=0,j=0;
6        List<Integer> res=new ArrayList<>();
7        while(i<nums1.length && j<nums2.length){
8            if(nums1[i]>nums2[j]) j++;
9            else if(nums1[i]<nums2[j]) i++;
10            else{
11                res.add(nums1[i]);
12                i++;
13                j++;
14            }
15        }
16        int ans[] =new int[res.size()];
17        for(int k=0;k<res.size();k++){
18            ans[k]=res.get(k);
19        }
20        return ans;
21
22
23
24    }
25}