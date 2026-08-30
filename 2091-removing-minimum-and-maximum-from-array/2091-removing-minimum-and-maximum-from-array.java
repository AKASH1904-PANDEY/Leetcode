class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min =0;
        int max =0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[min]){
                min =i;
            }
            if(nums[i]> nums[max]){
                max =i;
            }
        }
        if(min>max){
            int temp = min;
            min=max;
            max =temp;
        }
        int fl = max+1;
        int fr = n- min;
        int fb = (min+1)+(n-max);
        return Math.min(
             fl,
    Math.min(fr, fb)
);
      
    }
}