package dynamicProgramming;
import java.util.Scanner;
public class TargetSum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int target=scn.nextInt();
        int[] arr= {1,2,3,4,5,6};
        boolean [][] dp=new boolean[7][target+1];
        scn.close();
        for(int i=0;i<dp.length;i++) {
            for(int j=0;j<dp[i].length;j++) {
                if(i==0&&j==0) {
                    dp[i][j]=true;
                }else if(i==0) {
                    dp[i][j]=false;
                }else if(j==0) {
                    dp[i][j]=true;
                }else {
                    int val=arr[i-1];
                    if(dp[i-1][j]) {
                        dp[i][j]=true;
                    }else {
                        if(j>=val) {
                            if(dp[i-1][j-val]) {
                                dp[i][j]=true;
                            }
                       }
                    }
                }
            }
            
        }
        System.out.println(dp[6][target]);
    }
}
