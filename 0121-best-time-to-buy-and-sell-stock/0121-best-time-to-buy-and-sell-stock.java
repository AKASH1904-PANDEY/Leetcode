class Solution {
    public int maxProfit(int[] prices) {
       int max =0;
       int min = prices[0];
       for(int num: prices){
        max =Math.max(max,num-min);
        min = Math.min(min,num);
       }
       return max;
    }
}