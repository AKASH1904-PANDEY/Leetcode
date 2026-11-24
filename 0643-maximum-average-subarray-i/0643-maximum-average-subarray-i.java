class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum =0;
        for(int i=0;i<k;i++){
           sum+=nums[i];
        } 
        double maxavg = (double)sum/k;
        for(int i=k;i<n;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            double avg = (double)sum/k;
            maxavg = Math.max(avg,maxavg);
        }
        return maxavg;
    }
}