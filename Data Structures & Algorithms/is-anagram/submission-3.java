class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> list = new ArrayList<Character>();
        if(t.length()>s.length()){
            String temp = t;
            t = s;
            s = temp;
        }
        for(int i = 0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        System.out.println(list);
        for(int i = 0;i<t.length();i++){            
            list.remove(new Character(t.charAt(i)));
        }
        if(list.size() == 0){
            return true;
        } 
        return false;
        
    }
}
