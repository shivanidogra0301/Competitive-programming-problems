package dynamicProgramming;
import java.io.*;
import java.util.*;


public class MaximumSumIncreasingSequence {
	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        int[] dp = new int[n];
        
        dp[0] = arr[0];
        int ans = dp[0];
        for(int i = 1; i < n; i++){
            int max = 0;
            for(int j = i-1; j >= 0; j--){
                if(arr[j] <= arr[i]){
                    if(dp[j] > max){
                        max = dp[j];
                    }
                }
            }
            dp[i]  = max + arr[i];
            if(dp[i] > ans){
                ans = dp[i];
            }
            
        }
        
        System.out.println(ans);
        
    }
}
