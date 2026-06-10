class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(' ');
        for(int i = 0;i<s.length();i++){
            Character holder = s.charAt(i);
            if(holder == '}' && stack.peek() == '{'){
                stack.pop();
            }
            else if(holder == ']' && stack.peek() == '['){
                stack.pop();
            }
            else if(holder == ')' && stack.peek() == '('){
                stack.pop();
            }
            else{
                stack.push(holder);
            }
        }
        stack.pop();
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
