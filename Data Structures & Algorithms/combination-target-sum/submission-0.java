class Solution {
    List<List<Integer>> answer;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        answer = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        backtrack(nums, target, numbers, 0);
        return answer;
        
    }
    public void backtrack(int[] nums, int target, ArrayList<Integer> numbers, int i){
        if(target == 0){
            answer.add(new ArrayList(numbers));
            return;
        }
        if(target<0 || i>=nums.length){
            return;
        }
        numbers.add(nums[i]);
        backtrack(nums, target-nums[i], numbers, i);
        numbers.remove(numbers.size()-1);
        backtrack(nums, target, numbers, i+1);

    } 
}
