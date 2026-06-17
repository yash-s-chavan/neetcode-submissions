class Solution {
public:
    int maxArea(vector<int>& heights) {
        int left = 0;
        int right = heights.size()-1;
        int most = 0;
        while(left<right){
            int volume = (right-left)*std::min(heights[left], heights[right]);
            most = std::max(most, volume);
            if(heights[left]<=heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return most;
    }
};
