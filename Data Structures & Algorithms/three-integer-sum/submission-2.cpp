class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        std::vector<vector<int>> answer;
        std::sort(nums.begin(), nums.end());
        int left = 0;
        int right = nums.size()-1;
        for(int i = 0; i < nums.size();++i){
            left = i+1;
            right = nums.size()-1;
            if(i != 0){
                if(nums[i] == nums[i-1]){
                    continue;
                }
            }
            while(left<right){
                if(left == i){
                    left++;
                }
                if(right == i){
                    right--;
                }
                if(nums[i]+nums[left]+nums[right]==0){
                    answer.push_back({nums[left], nums[i], nums[right]});
                    left++;
                    right--;
                    while(left<right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right] == nums[right+1]){
                        right--;
                    }
                    
                }
                else if(nums[i]+nums[left]+nums[right]<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return answer;
    }
};
