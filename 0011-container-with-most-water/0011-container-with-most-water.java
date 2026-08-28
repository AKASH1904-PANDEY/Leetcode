class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int low =0;
        int high = n-1;
        int res = 0;
        while(low<high){
            int area = Math.min(height[low],height[high])*(high-low);
            res =Math.max(res,area);
            if(height[low]<=height[high]){
                low++;
            }else{
                high--;
            }
        }
        return res;
    }
}