class Solution {
    public boolean isPalindrome(String s) {
      return palindrome(s,0,s.length()-1);
    }
    boolean palindrome(String s,int left,int right){
        if(left>=right){
            return true;
        }
        if(!Character.isLetterOrDigit(s.charAt(left))){
            return palindrome(s,left+1,right);
        }
        if (!Character.isLetterOrDigit(s.charAt(right))) {
            return palindrome(s, left, right - 1);
        }
        if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
            return false;
        }
        return palindrome(s,left+1,right-1);
    }
}