package dynamicProgramming;

public class KnapSackProblems {
    public static void main(String[] args) {
        int[] wts= {2,5,1,3,4};
		int[] vals= {15,14,10,45,30};
		int target=7;
//		printmaxval(wts,vals,target);
		printunbounded(wts,vals,target);
	}
	public static void printmaxval(int[]wts,int[] vals,int target) {
		int[][] dp=new int[wts.length+1][target+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[i].length;j++) {
				if(i==0||j==0) {
					dp[i][j]=0;
				}else {
					dp[i][j]=dp[i-1][j];
					if(j>=wts[i-1]) {
						if(dp[i-1][j-wts[i-1]]+vals[i-1]>dp[i][j]) {
							dp[i][j]= dp[i-1][j-wts[i-1]]+vals[i-1];
						}
					}
				}
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(dp[wts.length][target]);
	}
	public static void printunbounded(int[] wts,int[] vals,int target) {
		int[] dp=new int[target+1];
		dp[0]=0;
		for(int i=1;i<dp.length;i++) {
			for(int j=0;j<wts.length;j++) {
				if(i>=wts[j]) {
					dp[i]=Math.max(dp[i], dp[i-wts[j]]+vals[j]);
				}
			}
		}
		System.out.println(dp[target]);
	}

    
}
