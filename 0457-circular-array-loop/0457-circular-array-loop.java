class Solution {
    public boolean circularArrayLoop(int[] nums) {
       int n= nums.length;

       for(int i=0;i<n;i++){
        boolean forward = nums[i]>0;

         int slow = i;
         int fast = i;
        while(true){
         int nextslow = nextIndex(slow,nums);
         if(nums[nextslow]>0!=forward || nextslow ==slow){
            break;
         }
         int nextfast = nextIndex(fast,nums);

         if(nums[nextfast]>0!=forward || nextfast==fast){
            break;
         }
         int nextfast2 = nextIndex(nextfast,nums);

         if(nums[nextfast2]>0!=forward || nextfast2==nextfast){
            break;
         }
         slow = nextslow;
         fast = nextfast2;
         if(slow==fast){
            return true;
         }

       }
    }
    return false;
    }
       private int nextIndex(int index,int[] nums){
        int n = nums.length;
        return ((index+nums[index])%n+n)%n;
       } 
}