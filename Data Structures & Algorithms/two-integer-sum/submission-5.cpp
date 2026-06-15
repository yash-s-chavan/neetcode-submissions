class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        std::unordered_map<int, int> nummap;
        for(int i = 0;i<nums.size();++i){
            int val = target - nums[i];
            if(nummap.find(val) != nummap.end()){
                return{nummap[val], i};
            }
            nummap[nums[i]] = i;
        }
        return {};
    }
};
