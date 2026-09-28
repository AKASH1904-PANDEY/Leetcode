class Solution {
    public int maxDepth(String s) {
        int depth =0;
        int i =0;
        for(char ch : s.toCharArray()){
            if(ch==')'){
                depth--;
                continue;
            }
            if(ch!='(')continue;
            depth++;
            if(depth>i) i = depth;
        }
      return i;
    }
}