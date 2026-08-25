class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] contains = new boolean[201];
        for(int i : nums){
            contains[i] =true;
        }
        int ans =k;
        while(contains[ans]){
            ans+=k;
        }
        return ans;
    }
}