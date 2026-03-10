// Last updated: 3/10/2026, 12:26:45 PM
1class Solution {
2    public List<String> restoreIpAddresses(String s) {
3        List<String> res=new ArrayList<>();
4        backtrack(s,0,0,"",res);
5        return res;
6    }
7    private static void backtrack(String s,int idx,int p,String curr,List<String>res){
8        if(p==4 && idx==s.length()){
9            res.add(curr.substring(0,curr.length()-1));
10            return;
11        }
12        if(p==4 || idx==s.length()) return;
13        for(int len=1;len<=3&& idx+len<=s.length();len++){
14            String seg=s.substring(idx,idx+len);
15            if(seg.startsWith("0")&&seg.length()>1) continue;
16            if(Integer.parseInt(seg)>255)continue;
17            backtrack(s,idx+len,p+1,curr+seg+'.',res);
18        }
19    }
20}