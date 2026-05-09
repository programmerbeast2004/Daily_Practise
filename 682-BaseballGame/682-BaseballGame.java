// Last updated: 5/9/2026, 11:30:56 AM
class Solution {
    public int calPoints(String[] ops) {
        List<Integer> ls=new ArrayList<>();
        for(String op:ops){
            if(op.equals("+")){
                int s=ls.size();
                ls.add(ls.get(s-1)+ls.get(s-2));
            }
            else if(op.equals("D")){
                ls.add(2*(ls.get(ls.size()-1)));
            }
            else if(op.equals("C")){
                ls.remove(ls.size()-1);
            }
            else{
                ls.add(Integer.parseInt(op));
            }
        }
        int sum=0;
        for(int num:ls){
            sum+=num;
        }
        return sum;
    }
}