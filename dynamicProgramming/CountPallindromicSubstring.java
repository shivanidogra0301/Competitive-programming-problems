package dynamicProgramming;

import java.util.Scanner;

public class CountPallindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        boolean[][] dp = new boolean[str.length()][str.length()];
        int count = 0;
        for(int g = 0; g < str.length(); g++){
            for(int i = 0, j = g; j < dp.length; j++,i++){
                if(g == 0){
                    dp[i][j] = true;
                }
                else if (g == 1){
                    if(str.charAt(i) == str.charAt(j))
                        dp[i][j] = true;
                }
                else{
                    if(str.charAt(i) == str.charAt(j) && dp[i+1][j-1] == true){
                        dp[i][j] = true;
                    }
                }
                
                if(dp[i][j] == true){
                    count++;
                }
            }
        }
        
        System.out.println(count);

	}

}
