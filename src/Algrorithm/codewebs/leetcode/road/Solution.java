package Algrorithm.codewebs.leetcode.road;

public class Solution {
    //new char[][]{{'Solution','B','C','E'},{'S','F','C','S'},{'Solution','D','E','E'}},"ABCCED"
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean aab = solution.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'E', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCESEEEFS");
        System.out.println(aab);
    }

    public boolean exist(char[][] board, String word) {
        int x=board.length;
        int y=board[0].length;
        char[] words=word.toCharArray();
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(dfs(board,i,j,words,0))return true;
            }
        }
        return false;
    }
    public boolean dfs( char[][] board, int x, int y, char[] word, int label) {
        if (y >= board[0].length || x >= board.length || y < 0 || x < 0|| board[x][y] != word[label] )
            return false;
        if (label == word.length-1) return true;
        board[x][y]='\0';
        boolean fright = dfs( board, x, y + 1, word, label + 1);
        boolean fleft = dfs( board, x, y - 1, word, label + 1);
        boolean fdown = dfs( board, x + 1, y, word, label + 1);
        boolean fup = dfs(board, x - 1, y, word, label + 1);
        board[x][y]=word[label];
        boolean flag=fright || fup || fdown || fleft;
        return flag;
    }
}
