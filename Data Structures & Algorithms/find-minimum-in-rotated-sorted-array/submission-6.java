class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        if(nums.length == 1){
            return nums[0];
        }
        while(l<r){
            int mid = (l+r)/2;
            if(nums[l]<=nums[mid] && nums[mid]<=nums[r]){
                return nums[l];
            }
            else if(nums[l]<nums[mid]){
                l = mid;

            }
            else{
                r = mid;
            }
        }
        return nums[l+1];
    }
}
