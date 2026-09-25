class Solution {
    public int characterReplacement(String s, int k) {
           int n = s.length();
           int[] count = new int[26];
           int len =0;
           int l =0;
           int maxfreq=0;

           for(int r=0;r<n;r++){
            count[s.charAt(r)-'A']++;
             maxfreq = Math.max(maxfreq, count[s.charAt(r)-'A']);
             while((r-l+1)-maxfreq>k){
                count[s.charAt(l)-'A']--;
                l++;
             }
             len = Math.max(len,r-l+1);
           }
           if(len==0){
            return 0;
           }else{
            return len;
           }

    }
}