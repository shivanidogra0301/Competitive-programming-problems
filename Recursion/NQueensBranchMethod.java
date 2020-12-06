package Recursion;
import java.util.Scanner;
public class NQueensBranchMethod {
	
	public static void main(String[] args) throws Exception {
	    Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        scn.close();
		
	    boolean[][] board = new boolean[n][n];
	    //write your code here
	    boolean[] cols = new boolean[n];
	    boolean[] ndiags = new boolean[2*n+1];
	    boolean[] rdiags = new boolean[2*n+1];
	    solve(board,0,cols,ndiags,rdiags,"");
	    
	  }
	  
	  public static void solve(boolean[][] board,int row,boolean[] cols,
	                    boolean[] ndiags, boolean[] rdiags, String asf){
	        if(row == board.length){
	            System.out.println(asf+".");
	            return;
	        }
	                        
	        for(int col = 0; col < board[row].length; col++){
	            if(cols[col] == false && ndiags[row+col] == false
	            && rdiags[row - col + board.length-1] == false){
	                board[row][col] = true;
	                cols[col] = true;
	                ndiags[row+col] = true;
	                rdiags[row-col+board.length-1] =true;
	                solve(board, row+1, cols,ndiags,rdiags, asf+row+"-"+col+", ");
	                board[row][col] = false;
	                cols[col] = false;
	                ndiags[row+col] = false;
	                rdiags[row-col+board.length-1] =false;
	            }
	        }                
	    }

	
}
