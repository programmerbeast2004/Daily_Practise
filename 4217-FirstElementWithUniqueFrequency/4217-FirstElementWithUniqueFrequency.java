// Last updated: 5/9/2026, 11:22:23 AM
class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer>a=new HashMap<>();
        for(int num:nums){
            a.put(num,a.getOrDefault(num,0)+1);
        }
        Map<Integer,Integer>b=new HashMap<>();
        for(int freq:a.values()){
            b.put(freq,b.getOrDefault(freq,0)+1);
        }
        for(int num:nums){
            int freq=a.get(num);
            if(b.get(freq)==1){
                return num;
            }
        }
        return -1;
    }
}