package sudokuSolver;

public class SudokuSolver {

	private static final int BOARD_SIZE = 9;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] board = new char[][] {
			{'5','3','.','.','7','.','.','.','.'},
			{'6','.','.','1','9','5','.','.','.'},
			{'.','9','8','.','.','.','.','6','.'},
			{'8','.','.','.','6','.','.','.','3'},
			{'4','.','.','8','.','3','.','.','1'},
			{'7','.','.','.','2','.','.','.','6'},
			{'.','6','.','.','.','.','2','8','.'},
			{'.','.','.','4','1','9','.','.','5'},
			{'.','.','.','.','8','.','.','7','9'}
					};
		displaySudoku(board);

		if(solveSudoku(board)) {
						System.out.println("Sudoku is sovled");
						displaySudoku(board);
					}else {
						System.out.println("Sudoku cannot be soleved");
						displaySudoku(board);
		}
	}

	private static void displaySudoku(char[][] board) {
		// TODO Auto-generated method stub
		for(int i=0;i<BOARD_SIZE;i++) {
			for(int j=0;j<BOARD_SIZE; j++) {
				System.out.print(board[i][j]+" | ");
			}
			System.out.println();
			System.out.println("------------------------------------");
		}
	}

	public static boolean solveSudoku(char[][] board) {

		if(!fillSudoku(board, 0, 0)){
			return false;
		}

		return true;
    }

	public static boolean fillSudoku(char[][] board, int row, int col){
		if(row>8){
			return true;
		}

		if(board[row][col] == '.'){
			for (int i = 1; i <=9 ; i++) {

				if(checkIfValid(board,row,col, (char) (i+'0'))){
					board[row][col] = (char) (i+'0');
					if(col>=8){
						if(fillSudoku(board,row+1,0)){
							return true;
						}
					}else{
						if(fillSudoku(board,row, col+1)){
							return true;
						}
					}
				}

			}
			board[row][col] = '.';
			return false;
		}
		if(col>=8){
			if(fillSudoku(board,row+1,0)){
				return true;
			}
		}else{
			if(fillSudoku(board,row, col+1)){
				return true;
			}
		}
		return false;
	}

public static boolean checkIfValid(char[][] board, int row, int col, char num){
		return checkRow(board, row, num) && checkCol(board, col, num) && checkIn3X3Box(board, row, col, num);
}

	private static boolean checkRow(char[][] board, int row, char num){
		for(int i=0;i<9;i++){
			if(board[row][i] == num){
				return false;
			}
		}
		return true;
	}

	private static boolean checkCol(char[][] board, int col, char num){

		for(int i=0;i<9;i++){
			if(board[i][col] == num){
				return false;
			}
		}
		return true;
	}

	private static boolean checkIn3X3Box(char[][] board, int row, int col, char num){
		for(int i=0;i<3;i++) {
			for (int j = 0; j < 3; j++){
				int r = (row/3) *3 + i;
				int c = (col/3) *3 + j;
				if (board[r][c] == num) {
					return false;
				}
			}
		}
		return true;
	}

}
