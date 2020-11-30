package dynamicProgramming;
import java.io.*;
import java.util.*;
public class MinSquares {

		public static int solution(int n){
			//write your code here
			int[] dp = new int[n+1];
			dp[0] = 0;
			dp[1] = 1;
			for(int i = 2; i <= n; i++){
			    int min = Integer.MAX_VALUE;
			    for(int j = 1; j*j <= i; j++){
			        if(dp[i - j*j] < min){
			            min = dp[i - j*j];
			        }
			    }
			    dp[i] = min+1;
			}

			return dp[n];
		}

		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			System.out.println(solution(n));
		}


		
	
}
