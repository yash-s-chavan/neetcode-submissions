class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")){
            return 0; 
        }
        // if(s.equals(" ")){
        //     return 1;
        // }
        HashSet<Character> set = new HashSet<>();
        int max = 1;
        int i = 0;
        int j = 1;
        set.add(s.charAt(i));
        while(j<s.length()){
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            else{
                set.add(s.charAt(j));
                max = Math.max(max, j-i+1);
                j++;
            }
        }
        return max;
    }
}
