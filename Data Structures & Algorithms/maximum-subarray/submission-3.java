class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int total = nums[0];
        int max = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(total < 0){
                total = 0;
            }
            total+= nums[i];
            if(total > max){
                max = total;

            }

        }
        return max;
    }
}
