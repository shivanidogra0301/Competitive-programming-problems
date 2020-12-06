package dynamicProgramming;

public class CoinProblem {
    public static void main(String[] args) {
		int[] coin= {2,3,5};
		int target=7;
		
		combinations(target,coin);
		permutations(target,coin);
	}
	public static void combinations(int target,int[]coin) {
		int[] dp=new int[target+1];
		dp[0]=1;
		for(int i=0;i<coin.length;i++) {
			for(int j=coin[i];j<dp.length;j++) {
				dp[j]+=dp[j-coin[i]];
				}
		}
		System.out.println(dp[target]);
	}
	public static void permutations(int target, int[] coin) {
		int[] dp=new int[target+1];
		dp[0]=1;
		for(int i=1;i<dp.length;i++) {
			for( int j=0;j<coin.length;j++) {
				if(i>=coin[j]) {
					dp[i]+=dp[i-coin[j]];
				}
			}
		}
		System.out.println(dp[target]);
	}
}
