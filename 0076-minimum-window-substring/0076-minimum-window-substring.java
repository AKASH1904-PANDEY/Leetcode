class Solution {
    public String minWindow(String s, String t) {
        int[] need = new int[128];
        for(char c : t.toCharArray()){
           need[c]++;
        }
        int l=0;
        int r=0;
        int formed =0;
        int required =0;
        for (int i = 0; i < 128; i++) {
            if (need[i] > 0) {
                required++;
            }
        }
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        int[] window = new int[128];
        while(r<s.length()){
            char c = s.charAt(r);
            window[c]++;
            if (need[c] > 0 && window[c] == need[c]) {
                formed++;
            }
             while (formed == required) {
                 if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }
                 char leftChar = s.charAt(l);
                 window[leftChar]--;
                  if (need[leftChar] > 0 &&
                    window[leftChar] < need[leftChar]) {
                    formed--;
                }
                l++;
             }
             r++;
        }
         if (minLen == Integer.MAX_VALUE) {
            return "";
        }
         return s.substring(start, start + minLen);
    }
}