package dynamicProgramming;

import java.util.Scanner;

/* You are required to print the maximum profit you can make 
  if you are allowed k transactions at-most.
  Input
  6 9 6 7 6 3 8 1
  Output 5
 */
public class BuyAndSellKtransaction {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        
        int k = s.nextInt();
        s.close();

        int[][] dp = new int[k+1][n];
        for( int t = 1; t < dp.length; t++){
            int max = Integer.MIN_VALUE;
            for(int d = 1; d < dp[t].length; d++ ){
                if(dp[t-1][d-1] - arr[d-1] > max){
                    max = dp[t-1][d-1] - arr[d-1];
                }
                dp[t][d] = dp[t][d-1];
                if(max + arr[d] > dp[t][d]){
                    dp[t][d] = max + arr[d];
                }
            }
        }
        
        System.out.println(dp[k][n-1]);
	}
}
