package mostStonesRemovedWithSameRowColumn;

public class Solution {

    public static void main(String[] args) {

        int[][] numbers = new int[][] {{0,1},{0,2},{4,3},{2,4},{0,3},{1,1}};
        System.out.println(removeStones(numbers));
    }

    public static int removeStones(int[][] stones) {

        int[] last = stones[stones.length-1];
        int[][] currentStones = new int[stones.length][2];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i <stones.length ; i++) {
            if(maxRow < stones[i][0]) maxRow = stones[i][0];
            if(maxCol < stones[i][1]) maxCol = stones[i][1];

            currentStones[i][0] = stones[i][0];
            currentStones[i][1] = stones[i][1];
        }
        int[][] board = createBoard(stones, maxRow, maxCol);
        System.out.println("Max no of stone can be removed\t"+countNoOfStone(board, 1, 1));
        display2DArray(board);


        return 0;
    }

    public static int countNoOfStone(int[][] board, int row, int col){
        int count = 0;
        if (board.length == 1) return 0;
        if(row > board.length) return -1;
        if(col > board.length) return -1;

        for (int i = row; i <board.length ; i++) {
            for (int j = col; j <board[0].length; j++) {
                int rowcount = 0;
                int colcount = 0;
                if(board[i][j] == 1){
                    board[i][j] = 8;
                    int newcol = checkStoneInCol(board,i, j);
                    if( newcol >= 0){
                        colcount = countNoOfStone(board,newcol, j);
                    }
                    int newrow = checkStoneInRow(board,i, j);
                    if( newrow >= 0){
                        rowcount = countNoOfStone(board,i, newrow);

                    }
                    if(newrow >= 0 || newcol >= 0) count++;
//                    if(colcount >= rowcount && colcount > 0 ){
//                        count += colcount;
//                    }
//                    if(rowcount > colcount && rowcount > 0 ){
//                        count += rowcount;
//                    }
                    System.out.println("Count\t"+ count);
//                    if(newcol < 0 && newrow < 0){
//                        if(colcount > rowcount && colcount > count){
//                            count = colcount;
//                        }
//                        if(rowcount > colcount && rowcount > count){
//                            count = rowcount;
//                        }
//                    }
                    board[i][j] = 1;
                }
            }
        }


        return count;
    }

    public static int checkStoneInRow(int[][] board, int row, int col){
        for (int i = 0; i < board[0].length; i++) {
            if(board[row][i] == 1)return i;
        }
        return -1;
    }

    public static int checkStoneInCol(int[][] board, int row, int col){

        for (int i = 0; i < board[0].length; i++) {
            if(board[i][col] == 1) return i;
        }
        return -1;
    }

    public static void display2DArray(int[][] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        return;
    }

    public static int[][] createBoard(int[][] arr, int row, int col){
        int[][] board = new int[row+1][col+1];

        for (int i = 0; i <arr.length ; i++) {
                board[arr[i][0]][arr[i][1]] = 1;

        }
        return board;
    }

}
