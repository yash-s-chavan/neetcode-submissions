class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        s = s.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz1234567890";
        while(i<j){
            while(i<j && alphabet.indexOf(s.charAt(i)) == -1){
                i++;
            }
            while(i<j &&alphabet.indexOf(s.charAt(j)) == -1){
                j--;
            }
            if(s.charAt(i) != s.charAt(j)){
                System.out.println(s.charAt(i));
                System.out.println(s.charAt(j));
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
