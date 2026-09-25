class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int sum =nums[0];
        int ans =nums[0];
        int minend =nums[0];
        int maxend = nums[0];
        int maxsum = nums[0];
        int minsum = nums[0];
        for(int i=1;i<n;i++){
            int v1 = nums[i];
            int v2 = nums[i]+maxend;
            int v3 = nums[i]+minend;
            maxend = Math.max(v1,v2);
            minend = Math.min(v1,v3);
            maxsum = Math.max(maxsum,maxend);
            minsum = Math.min(minsum,minend);
            sum+=nums[i];
        }
        if(maxsum<0) return maxsum;
        ans = Math.max(sum-minsum,maxsum);
        return ans;
    }
}