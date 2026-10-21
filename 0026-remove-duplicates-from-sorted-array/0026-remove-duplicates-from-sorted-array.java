/*class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        int i=1;
        for(int j=1;j<n;j++){
            if(nums[j]==nums[i-1]){
                continue;
            }else{
               nums[i] = nums[j];
               i++;
            }
        }
        return i;
    }
}
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}