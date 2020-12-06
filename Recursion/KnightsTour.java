package Recursion;

public class KnightsTour {

	public static void main(String[] args) {
		int[][] chess=new int[5][5];
		printKnightsTour(chess,1,1,1);
	}
	public static void printKnightsTour(int[][]chess,int r,int c, int move) {
		if(r<0||c<0||r>=chess.length||c>=chess[r].length||chess[r][c]>0) {
			return;
		}
		else if(move==chess.length*chess.length) {
			chess[r][c]=move;
			displayboard(chess);
			chess[r][c]=0;
			return;
		}
		chess[r][c]=move;
		printKnightsTour(chess,r-2,c+1,move+1);
		printKnightsTour(chess,r-1,c+2,move+1);
		printKnightsTour(chess,r+1,c+2,move+1);
		printKnightsTour(chess,r+2,c+1,move+1);
		printKnightsTour(chess,r+2,c-1,move+1);
		printKnightsTour(chess,r+1,c-2,move+1);
		printKnightsTour(chess,r-1,c-2,move+1);
		printKnightsTour(chess,r-2,c-1,move+1);
		chess[r][c]=0;
	}
	public static void displayboard(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("****************************************");
	}
}
