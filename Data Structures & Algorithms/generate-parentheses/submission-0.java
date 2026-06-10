class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> answer = new ArrayList<String>();
        String holder = "";
        backtrack(answer, 0, 0, n, holder);
        return answer;
    }
    public void backtrack(List<String> answer, int open, int close, int n,String holder){
        if(open == close && open == n){
            answer.add(holder);
            return;
        }
        if(open<n){
            holder+="(";
            backtrack(answer,open+1,close,n,holder);
            holder = holder.substring(0,holder.length()-1);
        }
        if(close<open){
            holder+=")";
            backtrack(answer,open,close+1,n,holder);
            holder = holder.substring(0,holder.length()-1);
        }
    }
}
