// Last updated: 5/9/2026, 11:29:46 AM
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