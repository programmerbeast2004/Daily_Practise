// Last updated: 11/23/2025, 1:11:00 AM
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        int st=0, ed=arr.length-1;
        while(st<ed){
            if(Character.isLetter(arr[st]) && Character.isLetter(arr[ed]) ){
                char temp=arr[st];
                arr[st]=arr[ed];
                arr[ed]=temp;
                st++;
                ed--;
            }
            else if(!Character.isLetter(arr[ed])){
                ed--;
            }
            else{
                st++;
            }
        }
        return new String(arr);
    }
}