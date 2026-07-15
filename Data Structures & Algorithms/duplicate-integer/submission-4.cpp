class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_set<int> set;
        for(int i = 0;i<nums.size();++i){
            if(set.insert(nums[i]).second == false){
                return true;
            }
        }
        return false;
    }
};