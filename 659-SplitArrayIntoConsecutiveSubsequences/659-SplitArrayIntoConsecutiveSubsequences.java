// Last updated: 5/9/2026, 11:31:01 AM
class Solution {
    public boolean isPossible(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        HashMap<Integer,Integer> need=new HashMap<>();

        //1. Count freq
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        //2.Greedy approach 
        for(int num:nums){
            if(freq.get(num)==0) continue;
            
            //1 Extend exisitng subsequence
            if(need.getOrDefault(num,0)>0){
                need.put(num,need.get(num)-1);
                need.put(num+1,need.getOrDefault(num+1,0)+1);
            }
            //2. sTART NEW SEQ
            else if(freq.getOrDefault(num+1,0)>0 && freq.getOrDefault(num+2,0)>0){
                freq.put(num+1,freq.get(num+1)-1);
                freq.put(num+2,freq.get(num+2)-1);
                need.put(num+3,need.getOrDefault(num+3,0)+1);
            }
            //3 Impossible seq
            else{
                return false;
            }
            freq.put(num,freq.get(num)-1);
        }
        return true;

    }
}