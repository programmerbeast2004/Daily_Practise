// Last updated: 7/31/2025, 12:16:56 PM
class Solution {
    public String triangleType(int[] nums) {
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        if((a+b<=c)||(b+c<=a)||(a+c<=b)) return "none";
        else if((a==b)&&(b==c)) return "equilateral";
        else if((a==b)||(b==c)||(a==c)) return "isosceles";
        else return "scalene";
    }
}