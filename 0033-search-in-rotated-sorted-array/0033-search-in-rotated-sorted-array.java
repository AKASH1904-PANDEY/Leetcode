class Solution {
    public int search(int[] nums, int target) {
       int n = nums.length;
       int low =0;
       int high =n-1;
       while(low<=high){
        int mid = low+(high-low)/2;
        if(nums[mid]==target){
            return mid;
        }
        //we will go to check that  the the left half is sorted or not 
        if(nums[low]<=nums[mid]){
            if(nums[low]<=target && nums[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        // we will check the right half in this 
        else{
            if(nums[high]>=target && nums[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
       }
        return -1;
    } 
}