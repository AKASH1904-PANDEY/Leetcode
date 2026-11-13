class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>1){
                res.add(key);
            }
        }
        return res;
    }
}