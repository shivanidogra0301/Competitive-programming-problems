package SortingAndSearching;
import java.util.Scanner;
public class MatrixChainMultiplication {
	

	
	    public static void main(String[] args) {
	        Scanner scn  = new Scanner(System.in);
	        int n = scn.nextInt();
	        int[] arr = new int[n];
	        for(int i = 0; i < arr.length ; i++){
	            arr[i] = scn.nextInt();
	        }
			scn.close();

	        mcm(arr);
	     }

	     public static void mcm(int[] arr) {
	          int[][] dp = new int[arr.length -1][arr.length -1];
	          int[][] split = new int[arr.length -1][arr.length -1];
	          for(int gap = 0;  gap < dp.length; gap++){
	              for(int i = 0 , j = gap; j < dp[0].length; i++,j++){
	                  if(gap == 0){
	                      dp[i][j] = 0;
	                  }
	                  else if(gap == 1){
	                      dp[i][j] = arr[i] * arr[j] * arr[j + 1];
	                      split[i][j] = i + 1;
	                  }
	                  else{
	                      int min = Integer.MAX_VALUE;
	                      int idx = 0;
	                      for(int k = i; k < j; k++){
	                          int lc = dp[i][k];
	                          int rc = dp[k + 1][j];
	                          int mc = arr[i]  * arr[k + 1] * arr[j + 1];
	                          int tc = lc + rc + mc;
	                          if(tc < min){
	                              min = tc;
	                              idx = k + 1;

	                          }
	                        } 
	                        dp[i][j] = min;
	                        split[i][j] = idx;
	                    }
	              }
	            }
	        for(int i = 0 ; i< dp.length ; i++){
	            for(int j = 0; j < dp[0].length; j++){
	                System.out.format("% 8d  ",dp[i][j]);
	            }
	            System.out.println();
	        }

	        System.out.println("-----------------");
	        for(int i = 0 ; i< split.length ; i++){
	            for(int j = 0; j < split[0].length; j++){
	                System.out.print(split[i][j] + " ");
	            }
	            System.out.println();
	        }
	     }
	}

	     






