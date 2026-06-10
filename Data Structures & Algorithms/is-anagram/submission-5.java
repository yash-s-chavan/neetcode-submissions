class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0;i<s.length();i++){
            map.merge(s.charAt(i), 1, Integer::sum);
            map.merge(t.charAt(i), -1, Integer::sum);
        }
        for(int i: map.values()){
            if(i !=0){
                return false;
            }
        }
        return true;
    }
}
