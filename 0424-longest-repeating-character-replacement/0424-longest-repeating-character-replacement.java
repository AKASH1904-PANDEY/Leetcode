class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int l=0;
        int res =0;
        int max =0;
        int n = s.length();
        for(int r =0;r<n;r++){
            count[s.charAt(r)-'A']++;
            max = Math.max(max,count[s.charAt(r) -'A']);
         while((r-l+1)-max>k){
            count[s.charAt(l) -'A']--;
            l++;
         }
         res =Math.max(res,r-l+1);
        }
        return res;
    }
}