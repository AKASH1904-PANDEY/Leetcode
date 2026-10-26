class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int n = candidates.length;
        combination(candidates,n,0,target,0,temp,res);
        return res;
    }
    public static void combination(int[] candidates,int n,int idx,int target,int sum, List<Integer> temp,List<List<Integer>>res){
     
if (sum == target) {
    res.add(new ArrayList<>(temp));
    return;
}
   if (sum > target || idx==n) {
    return;
}
      
        combination(candidates,n,idx+1,target,sum,temp,res);
        if(candidates[idx]+sum<=target){
            temp.add(candidates[idx]);
            sum+=candidates[idx];
            combination(candidates,n,idx,target,sum,temp,res);
            temp.remove(temp.size()-1);
            sum-=candidates[idx];
        }
         return;

    }
}