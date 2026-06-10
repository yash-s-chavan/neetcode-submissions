class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int current = nums[i];
                while(set.contains(current)){
                    current++;
                }
                current -= nums[i];
                if(current > max){
                    max = current;
                }
            }
        }
        return max;
    }
}
