class Solution {
    public int search(int[] nums, int target) {
       int n = nums.length;
       int l = 0;
       int h = n-1;
       while(l<h){
        int mid = l+(h-l)/2;
        if(target==mid){
            return mid;
        }else if(target<nums[mid] && nums[mid]>=nums[h]){
            l =mid+1;
        }else{
            h=mid;
        } 
        else{
            if(target>nums[mid] && nums[mid]<=nums[h]){
                l =mid+1;
            }else{
                h = mid-1;
            }
        }
       }
       return -1;
    } 
}