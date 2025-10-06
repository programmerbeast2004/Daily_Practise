// Last updated: 10/6/2025, 7:22:56 PM
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();
        String[] directories=path.split("/");
        for(String dir:directories){
            if(dir.equals(".") || dir.isEmpty()){
                continue;
            }
            else if(dir.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                    stack.push(dir);
                }
           
        }
         return "/"+String.join("/",stack);
    }
}