package dynamicProgramming;
import java.util.*;
public class LongestIncreasingSubesquence {
	public static void main(String[] args) throws Exception {
	        // write your code here
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int[] arr = new int[n];
	        for(int i = 0; i < arr.length; i++){
	            arr[i] = s.nextInt();
			}
			s.close();
			
	        int[] dp = new int[n];
	        
	        dp[0] = 1;
	        int ans = 1;
	        for(int i = 1; i < n; i++){
	            int max = 0;
	            for(int j = i-1; j >= 0; j--){
	                if(arr[j] < arr[i]){
	                    if(dp[j] > max){
	                        max = dp[j];
	                    }
	                }
	            }
	            dp[i]  = max + 1;
	            if(dp[i] > ans){
	                ans = dp[i];
	            }
	            
	        }
	        
	        System.out.println(ans);
	        
	        
	        

	}
	

}
