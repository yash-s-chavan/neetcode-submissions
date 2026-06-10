class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int answer = 0;
        for(int i = 0;i<tokens.length;i++){
            System.out.println(stack);
            if(tokens[i].equals("+")){
                stack.push(Integer.parseInt(stack.pop())+Integer.parseInt(stack.pop())+"");
            }
            else if(tokens[i].equals("-")){
                stack.push((Integer.parseInt(stack.pop())-Integer.parseInt(stack.pop()))*-1+"");
            }
            else if(tokens[i].equals("*")){
                stack.push(Integer.parseInt(stack.pop())*Integer.parseInt(stack.pop())+"");
            }
            else if(tokens[i].equals("/")){
                int holder =Integer.parseInt(stack.pop());
                stack.push(Integer.parseInt(stack.pop())/holder+"");
            }
            else{

                stack.push(tokens[i]);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
