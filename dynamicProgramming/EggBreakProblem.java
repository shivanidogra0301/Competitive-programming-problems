package dynamicProgramming;
import java.util.Scanner;

public class EggBreakProblem {
	
	public static int eggDrop(int n, int k){
		//write your code here
		int[][] dp = new int[n+1][k+1];
		
		for(int i = 1; i < dp.length; i++){
		    for(int j = 1; j < dp[0].length; j++){
		        if(j == 1){
		            dp[i][j] = 1;
		        }
		        else if(i == 1){
		            dp[i][j] = j;
		        }
		        else {
		            int min = Integer.MAX_VALUE;
		            
		            for(int mj = j-1,pj = 0; mj >= 0; mj--,pj++){
		                int val1 = dp[i][mj]; //egg does not breaks
		                int val2 = dp[i-1][pj]; // egg breaks
		                
		                int max = Math.max(val1,val2);
		                if(max < min){
		                   min = max;
		                }
		                
		            }
		            dp[i][j] = min + 1;
		        }
		        
		    }
		}

		return dp[n][k];
	} 

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//n -> number of eggs and k -> number of floors
		int n = scn.nextInt();
		int k = scn.nextInt();
		System.out.println(eggDrop(n,k));
	}

}
