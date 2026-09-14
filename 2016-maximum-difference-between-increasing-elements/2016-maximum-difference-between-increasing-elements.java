class Solution {
    public int maximumDifference(int[] nums) {
        int max=0;
        int n =nums.length;
        for(int i=0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(nums[j]>nums[i]){
                   max= Math.max(max,nums[j]-nums[i]);
                } 
            }
        }
        if(max==0){
            return -1;
        }
        return max;
    }
}