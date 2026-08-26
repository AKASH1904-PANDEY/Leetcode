class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            Set<Character> set = new HashSet<>();
            for(int j=0;j<9;j++){
                char ch = board[i][j];
                if(ch == '.'){
                    continue;
                }
                if(set.contains(ch)){
                    return false;
                }
                set.add(ch);
            }
        }
        for(int i=0;i<9;i++){
            Set<Character>set =new HashSet<>();
            for(int j=0;j<9;j++){
                char ch = board[j][i];

                if(ch=='.'){
                    continue;
                }
                if(set.contains(ch)){
                    return false;
                }
                set.add(ch);
            }
        }
        for(int box=0;box<9;box++){
            Set<Character>set = new HashSet<>();
            int row = (box/3)*3;
            int col = (box%3)*3;
            for(int i=row;i<row+3;i++){
                for(int j= col;j<col+3;j++){
                     char ch = board[i][j];
                if(ch=='.'){
                    continue;
                }
                if(set.contains(ch)){
                    return false;
                }
                set.add(ch);
                }
            }

        }
       return true;

    }
}
