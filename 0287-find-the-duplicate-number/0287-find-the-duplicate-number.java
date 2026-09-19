class Solution {
    public int findDuplicate(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
       for(int num : nums){
        map.put(num,map.getOrDefault(num,0)+1);
       } 
       for(int num : nums){
       if(map.get(num)>1){
         return num;
        }
    }
       return -1;
     /*  Set<Integer> set = new HashSet<>();
       for(int ch : nums){
        set.add(ch);
       }
       if(set.contains()>1){
        return ch;
       }
       */
    }
}