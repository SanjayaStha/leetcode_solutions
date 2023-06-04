package NQueensProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {

        int n = 9;

        char[][] board = new char[n][n];
        List<List<String>> finalList = new ArrayList<>();
        for (char[] row : board)
            Arrays.fill(row, '.');
        if(solveNQueen(board, 0, 0,finalList)){
                System.out.println("Board Solved!!!");
                for(List<String> r: finalList)
                    for (String row : r){
                        System.out.println(row);
                    }


                
        }else {
            System.out.println("Board cannot be solved");
        }

    }

    private static boolean solveNQueen(char[][] board, int row, int target, List<List<String>> finalList) {

        if(target == board[0].length){
            List<String> newrow = new ArrayList<>();
            for (char[] row1 : board){
                newrow.add(new String(row1));
            }
            finalList.add(newrow);
            return true;
        }
                for (int j = 0; j < board[0].length; j++) {
                    if(isPositionValid(board,row,j)){
                        board[row][j] = 'Q';
                       solveNQueen(board, row+1,target+1, finalList);
                        board[row][j] = '.';
                    }

        }

        return finalList.size()>0;
    }

    public static boolean checkRow(char[][] board, int row){
        if(row>=board[0].length){
            return false;
        }
        for (int i = 0; i <board[0].length ; i++) {
            if(board[row][i] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static boolean checkCol(char[][] board, int col){
        for (int i = 0; i <board[0].length ; i++) {
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static boolean checkDiagonal(char[][] board, int row, int col){
            for (int j = 0; j <board[0].length ; j++) {
                int trow = row + j;
                int tcol = col + j;
                if (trow < board[0].length && tcol < board[0].length && board[trow][tcol] == 'Q') {
                    return false;
                }
                trow = row - j;
                tcol = col - j;
                if (trow > -1 && tcol > -1 && board[trow][tcol] == 'Q') {
                    return false;
                }

                trow = row + j;
                tcol = col - j;
                if (trow < board[0].length && tcol > -1 && board[trow][tcol] == 'Q') {
                    return false;
                }

                trow = row - j;
                tcol = col + j;
                if (trow > -1 && tcol < board[0].length && board[trow][tcol] == 'Q') {
                    return false;
                }

            }
        return true;
    }

    public static boolean isPositionValid(char[][] board, int row, int col){
//        System.out.println("checkRow\t"+checkRow(board, row));
//        System.out.println("checkCol\t"+checkCol(board, row));
//        System.out.println("checkDiagonal\t"+checkDiagonal(board, row, col));
        return checkRow(board, row) && checkCol(board, col) && checkDiagonal(board, row, col);
    }

}
