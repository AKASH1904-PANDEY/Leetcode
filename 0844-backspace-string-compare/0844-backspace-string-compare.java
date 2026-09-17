class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> mt = new Stack<>();
        for(char ch : s.toCharArray()){
          
            if(ch =='#'){
              if(!st.isEmpty()){
                 st.pop();
              }
              }else{
                st.push(ch);
              }
            
        }
            for(char ch : t.toCharArray()){
            
            if(ch =='#'){
              if(!mt.isEmpty()){
                 mt.pop();
              }
              }else{
                mt.push(ch);
              
            } 
        }
        if(st.size()!= mt.size()){
            return false;
        }

        while(!st.isEmpty()){
            if(st.pop()!=mt.pop()){
                return false;
            }
        }
        return true;


    }
}