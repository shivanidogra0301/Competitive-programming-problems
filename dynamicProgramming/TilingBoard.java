package dynamicProgramming;
//We have two types of tiles: a 2x1 domino shape, and an "L" tromino shape. These 
//shapes may be rotated.
//XX  <- domino
//XX  <- "L" tromino
//X
//Given N, how many ways are there to tile a 2 x N board? Return your answer modulo 10^9 + 7.
public class TilingBoard {
    private static final int MOD = 1000000007;
	    
	 public int numTilings(int N) {
	     int p3 = -1, p2 = 0, p1 = 1;
	         
	     for (int n = 1; n <= N; n++) {
	         int cur = (p1*2%MOD+ p3)%MOD;
	         p3 = p2;
	         p2 = p1;
	         p1 = cur;
	     }
	         
	     return p1;
	 }
	 public static void main(String[] args) {
		 TilingBoard t= new TilingBoard();
		 System.out.println("Ways to add tiles : "+ t.numTilings(3));
	 }
}
