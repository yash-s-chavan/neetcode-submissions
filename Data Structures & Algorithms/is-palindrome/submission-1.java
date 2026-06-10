class Solution {
    public boolean isPalindrome(String s) {
       int low = 0;
       int high = s.length()-1;
       String reference = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
       while(low<high){
        while(reference.indexOf(s.charAt(low))==-1 && low<high){
            low++;
        }
        while(reference.indexOf(s.charAt(high))==-1&& low<high){
            high--;
        }

        if(Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))){
            return false;
        }
        low++;
        high--;
       }
       return true;
    }
}
