class Solution {
    public int lengthOfLongestSubstring(String s) {
     Set<Character> set = new HashSet<>();
     int len =0;
     int l =0;
     int n =s.length();
     for(int r=0;r<n;r++){
       char chr = s.charAt(r);
       while(set.contains(chr)){
         char chl = s.charAt(l);
         set.remove(chl);
         l++;
       }
       set.add(chr);
       len = Math.max(len,r-l+1);
     }
     if(len==0){
        return 0;
     }else{
        return len;
     }
    }
}