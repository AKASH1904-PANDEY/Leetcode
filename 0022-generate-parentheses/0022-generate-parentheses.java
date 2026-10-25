class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(n,0,0,res,"");
        return res;
    }
    public static void generate(int n,int open, int close, List<String> res ,String temp){
        if(open==n && close == n){
            res.add(temp);
            return;
        }
        if(open<n){
            generate(n,open+1,close,res,temp+"(");
        }
        if(close<open){
            generate(n,open,close+1,res,temp+")");
        }
    }
}