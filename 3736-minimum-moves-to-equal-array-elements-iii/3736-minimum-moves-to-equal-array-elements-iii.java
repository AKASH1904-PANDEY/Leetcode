class Solution {
    public int minMoves(int[] nums) {
        int n =nums.length;
        int moves =0;
       int num =0;
        for(int i=0;i<n;i++){
            if(nums[i]>num){
                num = nums[i];
            }
        }
        for(int i =0;i<n;i++){
            moves+=num-nums[i];
        }
        return moves;
    }
}