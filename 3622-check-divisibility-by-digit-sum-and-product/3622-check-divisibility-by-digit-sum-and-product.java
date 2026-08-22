class Solution {
    public boolean checkDivisibility(int n) {
       int sum =0;
       int prod =1;
       for(int i=n;i>0;i/=10){
         int ans= i%10;
         sum+=ans;
         prod*=ans;
       }
       int result = sum+prod;
       return n%result==0;
    }
}