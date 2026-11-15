class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int res =0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int digit = x%10;
            res = (res*10)+digit;
            x = x/10;
        }
        if(res==original){
            return true;
        }
        return false;
    }
}