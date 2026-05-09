// Last updated: 5/9/2026, 11:28:42 AM
class Solution {
    public int tupleSameProduct(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int p=nums[i]*nums[j];
                map.put(p,map.getOrDefault(p,0)+1);
            }
        }
        int ans=0;
        for(int c:map.values()){
            if(c>1){
                ans+=4*c*(c-1);
            }

        }
        return ans;
    }
}