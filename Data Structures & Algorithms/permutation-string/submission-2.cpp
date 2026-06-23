class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        std::vector<int> alphabet(26, 0);
        std::vector<int> ref(26, 0);
        for(int i = 0;i<s1.length();++i){
            alphabet[s1[i]-'a']++;
            ref[s1[i]-'a']++;
        }
        int left = 0;
        int right = 0;
        while (right < s2.length()) {
            alphabet[s2[right] - 'a']--;
            
            
            while (alphabet[s2[right] - 'a'] < 0) {
                alphabet[s2[left] - 'a']++;
                left++;
            }
            
            
            if (right - left + 1 == s1.length()) {
                return true; 
            }
            
            right++;
        }
        return false;
    }
};
