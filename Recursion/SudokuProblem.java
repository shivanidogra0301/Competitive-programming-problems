package Recursion;
import java.util.Scanner;

/* You are given a board with some values and you have to fill the missing values.
INPUT:
3 0 6 5 0 8 4 0 0
5 2 0 0 0 0 0 0 0
0 8 7 0 0 0 0 3 1
0 0 3 0 1 0 0 8 0
9 0 0 8 6 3 0 0 5
0 5 0 0 9 0 6 0 0
1 3 0 0 0 0 2 5 0
0 0 0 0 0 0 0 7 4
0 0 5 2 0 6 3 0 0
*/
public class SudokuProblem {
	
	public static void display(int[][] board){
	    for(int i = 0; i < board.length; i++){
	      for(int j = 0; j < board[0].length; j++){
	        System.out.print(board[i][j] + " ");
	      }
	      System.out.println();
	    }
	  }

	  public static void solveSudoku(int[][] board, int i, int j) {
	    // write your code here
	    if(i == board.length){
	        display(board);
	        return;
	    }
	    
	    int ni = 0;
	    int nj = 0;
	    if(j == board[i].length - 1){
	        ni = i+1;
	        nj = 0;
	    } else{
	        nj = j+1;
	        ni = i;
	    }
	    
	    if(board[i][j] != 0){
	        solveSudoku(board, ni, nj);
	    }
	    else{
	        for(int pos = 1; pos <= 9; pos++){
	            if(isValid(i,j,pos,board)){
	                board[i][j] = pos;
	                solveSudoku(board, ni, nj);
	                board[i][j] = 0;
	            }
	        }
	    }
	    
	  }
	  
	  public static boolean isValid(int i, int j, int val, int[][] board){
	      // for row
	      for(int col = 0; col < board[0].length; col++){
	          if(board[i][col] == val){
	              return false;
	          }
	      }
	      
	      //for column
	      for(int row = 0; row < board.length; row++){
	          if(board[row][j] == val){
	              return false;
	          }
	      }
	      
	      // for 3X3 matrix
	      int mi = 3 * (i/3);
	      int mj = 3 * (j/3);
	      for(int row = 0; row < 3; row++){
	          for(int col = 0; col < 3; col++){
	             if(board[mi + row][mj + col] == val){
	                 return false;
	             }
	          }
	      }
	      return true;
	  }

	  public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
        scn.close();
		
	    int[][] arr = new int[9][9];
	    for (int i = 0; i < 9; i++) {
	      for (int j = 0; j < 9; j++) {
	        arr[i][j] = scn.nextInt();
	      }
	    }

	    solveSudoku(arr, 0, 0);
	  }
	


}
