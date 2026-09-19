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
     //we can  do it with hashset also it is more simple
    /* Set<Integer>set = new HashSet<>();
     for(int num : nums){
        if(set.contains(num)>1){
            return num;
        }
         set.add(num);
     }
     return -1;
     */
    }
}