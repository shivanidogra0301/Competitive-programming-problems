package dynamicProgramming;

import java.util.Scanner;

/*1. You are given a number n representing the length of a floor space which is 2m wide. It's 
 * a 2 * n board.
- You've an infinite supply of 2 * 1 tiles
- You are required to calculate and print the number of ways floor can be tiled using tiles. */

public class TilingQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        // when floor is 2 * n ans tile is 2 * 1
        tiling1(n);
        //when floor is n * m and tiles is m* 1
        tiling2(n, m);

	}
	public static void tiling1(int n) {
		int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        System.out.println(dp[n]);
		
	}
	public static void tiling2(int n, int m) {
		int[] dp = new int[n+1];
        dp[1] = 1;
        
        for(int i = 2; i <= n; i++){
            if(i < m){
                dp[i] = 1;
            }else if(i == m){
                dp[i] = 2;
            }else{
                dp[i] = dp[i - m] + dp[i - 1];
            }
        }
        
        System.out.println(dp[n]);
	}

}
