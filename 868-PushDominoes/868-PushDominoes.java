// Last updated: 5/9/2026, 11:30:12 AM
class Solution {
    public String pushDominoes(String s) {
        char[] d=('L'+s+'R').toCharArray();
        int i=0;
        for(int j=1;j<d.length;j++){
            if(d[j]=='.') continue;
            if(d[i]==d[j]){
                for(int k=i+1;k<j;k++){
                    d[k]=d[i];
                }
            }
            else if(d[i]=='R' &&d[j]=='L'){
                int l=i+1,r=j-1;
                while(l<r){
                    d[l++]='R';
                    d[r--]='L';
                }
            }
            i=j;
            
        }
        return new String(d,1,d.length-2);
    }
}