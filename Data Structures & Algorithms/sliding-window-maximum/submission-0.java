class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] answer = new int[nums.length-k+1];
        int i = 0;
        int j = k-1;
        while(j<nums.length){
            int max = nums[i];
            for(int l = i+1;l<=j;l++){
                if(nums[l]>max){
                    max = nums[l];
                }
            }
            answer[i] = max;
            i++;
            j++;
        }
        return answer;
    }
}
