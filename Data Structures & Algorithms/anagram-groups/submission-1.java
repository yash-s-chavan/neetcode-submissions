class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<Integer> alphabet = new ArrayList<>(Collections.nCopies(26, 0));
        List<List<String>> answer = new ArrayList<>();
        HashMap<ArrayList<Integer>, ArrayList<String>> map = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            for(int j = 0;j<strs[i].length();j++){
                int num = alphabet.get((int)(strs[i].charAt(j))-97);
                alphabet.set((int)(strs[i].charAt(j))-97, ++num);
            }
            ArrayList<String> temp = new ArrayList<>();
            if(map.containsKey(alphabet)){

                temp = map.get(alphabet);
                temp.add(strs[i]);
                map.put(alphabet, temp);
            }
            else{
                temp.add(strs[i]);
                map.put(alphabet, temp);
            }
            alphabet = new ArrayList<>(Collections.nCopies(26, 0));
        }
        for(ArrayList<String> i: map.values()){
            answer.add(i);
        }
        return answer;
    }
}
