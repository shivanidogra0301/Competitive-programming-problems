package Recursion;

import java.util.Scanner;

public class NQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[][] chess=new int[n][n];
		PrintQueenPos(chess,"",0);
	}
	public static void PrintQueenPos(int[][]chess,String psf,int row) {
		if(row==chess.length) {
			System.out.println(psf+".");
			return;
		}
		for(int col=0;col<chess.length;col++) {
			if(queenSafe(chess,row,col)==true) {
				chess[row][col]=1;
				PrintQueenPos(chess,psf+row+"-"+col+", ",row+1);
				chess[row][col]=0;
			}
			
		}
	}
	public static boolean queenSafe(int[][]chess,int row,int col) {
		//for vertical
		for(int i=row-1;i>=0;i--) {
			if(chess[i][col]==1) {
				return false;
			}
		}
		
		
		//for left diagonal
		for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--) {
			if(chess[i][j]==1) {
				return false;
			}
		}
		//for right diagonal
		for(int i=row-1,j=col+1;i>=0&&j<chess.length;i--,j++) {
			if(chess[i][j]==1) {
					return false;
				}
			}
		return true;
	}
}
