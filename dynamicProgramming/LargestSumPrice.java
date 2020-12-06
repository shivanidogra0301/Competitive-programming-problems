package dynamicProgramming;
import java.util.Arrays;
//In a 2D grid from (0, 0) to (N-1, N-1), every cell contains a 1, 
//except those cells in the given list mines which are 0. 
//What is the largest axis-aligned plus sign of 1s contained in the grid?
//Return the order of the plus sign. If there is none, return 0.
public class LargestSumPrice {
    public static void main(String[] args) {
        int N=5;
		int[][] mines= {{4, 2}};
		int order=orderOfLargestPlusSign( N,  mines);
		System.out.println("Order of the plus sign "+ order);

    }
    
	
	
	public static int orderOfLargestPlusSign(int N, int[][] mines) {
        int[][] dp=new int[N][N];
        //fill the arrays with value one
        for(int[] arr :dp){
            Arrays.fill(arr,1);
        }
        //fill the 0 to the cell present in mines
        for(int[] arr: mines){
            dp[arr[0]][arr[1]]=0;
        }
        for(int i=0;i<N;i++){
            int count=0;
            for(int j=0;j<N;j++){ // for left
                if(dp[i][j]!=0)
                    count++;
                else{
                    count=0;
                }
                dp[i][j]=count;
            }
            count=0;
            for(int j=N-1;j>=0;j--){ //for right
                if(dp[i][j]!=0)
                    count++;
                else
                    count=0;
                dp[i][j]=Math.min(count,dp[i][j]);
            }
        }
        
        int ans=0;
         for(int i=0;i<N;i++){
            int count=0;
            for(int j=0;j<N;j++){ // for down
                if(dp[j][i]!=0)
                    count++;
                else
                    count=0;
                
                dp[j][i]=Math.min(count,dp[j][i]);
            }
            count=0;
            for(int j=N-1;j>=0;j--){ //for up
                if(dp[j][i]!=0)
                    count++;
                else
                    count=0;
                dp[j][i]=Math.min(count,dp[j][i]);
                ans=Math.max(dp[j][i],ans);
            }
        }
        return ans;
    }
}
