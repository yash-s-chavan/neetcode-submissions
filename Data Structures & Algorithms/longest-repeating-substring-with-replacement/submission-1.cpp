class Solution {
public:
    int characterReplacement(string s, int k) {
        std::vector<int> counts(26, 0); // Tracks frequencies of 'A'-'Z' in the current window
        int mostOccuring = 0;
        int maxWindow = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            // 1. Add the new character to the window and update its count
            counts[s[right] - 'A']++;
            
            // 2. Update the max frequency in the current window
            mostOccuring = std::max(mostOccuring, counts[s[right] - 'A']);

            // 3. Current window size is (right - left + 1)
            // If valid changes allowed (k) is less than required changes, shrink window
            while ((right - left + 1) - mostOccuring > k) {
                counts[s[left] - 'A']--; // Remove left character from counts
                left++;                 // Shrink window
            }

            // 4. Track the maximum valid window seen so far
            maxWindow = std::max(maxWindow, right - left + 1);
        }

        return maxWindow;
    }
};
