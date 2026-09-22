class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len =Integer.MAX_VALUE;
        int n = nums.length;
        int low=0;
        int  sum=0;
        for(int high =0;high<n;high++){
            sum+=nums[high];
            while(sum>=target){
                len = Math.min(len,high-low+1);
                sum-= nums[low];
                low++;
            }

        }
       if(len==Integer.MAX_VALUE){
        return 0;
       }else{
        return len;
       }


    }
}