// Last updated: 3/10/2026, 11:46:16 AM
1class Solution {
2    public List<List<Integer>> permuteUnique(int[] nums) {
3        List<List<Integer>> res=new ArrayList<>();
4        Arrays.sort(nums);
5        boolean[]used=new boolean[nums.length];
6        backtrack(nums,used,new ArrayList<>(),res);
7        return res;
8    }
9    private static void backtrack(int[]nums,boolean[]used,List<Integer> curr,List<List<Integer>>res){
10        if(curr.size()==nums.length){
11            res.add(new ArrayList<>(curr));
12        }
13        for(int i=0;i<nums.length;i++){
14            if(used[i])continue;
15            if(i>0 && nums[i]==nums[i-1]&& used[i-1]==false) continue;
16            used[i]=true;
17            curr.add(nums[i]);
18            backtrack(nums,used,curr,res);
19            curr.remove(curr.size()-1);
20            used[i]=false;
21
22        }
23    }
24}