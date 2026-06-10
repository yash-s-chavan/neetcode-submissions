class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int mid = (low+high)/2;
        while(low<high){
            mid = (low+high)/2;
            System.out.println(nums[mid]);
            if(nums[mid]>nums[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return nums[low];
    }
}
