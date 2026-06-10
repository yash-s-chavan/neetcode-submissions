class Solution {
    public int maxArea(int[] heights) {
        int low = 0;
        int high = heights.length-1;
        int maxArea = 0;
        while(low<high){
            maxArea = Math.max(maxArea, Math.min(heights[low],heights[high])*(high-low));
            if(heights[low]<heights[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return maxArea;
    }
}
