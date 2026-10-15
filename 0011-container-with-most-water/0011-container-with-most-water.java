class Solution {
    public int maxArea(int[] height) {
       int n  =height.length;
       int l =0;
       int h = n-1;
       int res=0;
       while(l<h){
           int area = Math.min(height[l],height[h])*(h-l);
           res = Math.max(res,area);
           if(height[l]<=height[h]){
            l++;
           }else{
            h--;
           }
       }
       return res;
    }
}