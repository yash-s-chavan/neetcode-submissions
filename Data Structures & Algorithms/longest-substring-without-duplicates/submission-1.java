class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int i = 0;
        int j = 1;
        int answer = 1;
        if(s.length() == 0 ||s.length() == 1){
            return s.length();
        }
        map.put(s.charAt(0),1);
        while(j<s.length()){
            if(map.containsKey(s.charAt(j))){
                map.remove(s.charAt(i));
                i++;
            }
            else{
                map.put(s.charAt(j),1);
                
                j++;
                if(j-i>answer){
                    answer = j-i;
                }
            }
        }
        return answer;

    }
}
