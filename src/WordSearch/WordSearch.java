package WordSearch;

import java.util.Objects;

public class WordSearch {

    public static void main(String[] args) {
        char[][] board = new char[][] {{'a','a','a','a'},{'a','a','a','a'},{'a','a','a','a'}};
        System.out.println(exist(board, "aaaaaaaaaaaaa"));
    }

    public static boolean exist(char[][] board, String word) {

        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                   if(checkForNextLetter(i,j,0,board,word)){
                       return true;
                   }

            }
        }


        return false;
    }

    private static boolean checkForNextLetter(int i, int j, int index, char[][] board, String word) {
        if(index>=word.length()){
            return true;
        }
        if(i>=board.length || j>=board[0].length) {
            return false;
        }
        if(i<0 || j<0) {
            return false;
        }
        if(board[i][j] == word.charAt(index)){
            char t = board[i][j];
            board[i][j] = '.';
            if(checkForNextLetter(i+1,j,index+1,board,word) ||
                    checkForNextLetter(i-1,j,index+1,board,word) ||
                    checkForNextLetter(i,j-1,index+1,board,word) ||
                    checkForNextLetter(i,j+1,index+1,board,word)){
                return true;
            }else {
                board[i][j] = t;
            }


        }
        return false;
    }


}
