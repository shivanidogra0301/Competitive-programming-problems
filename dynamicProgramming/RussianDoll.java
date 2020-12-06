package dynamicProgramming;
import java.util.*;
public class RussianDoll {
	/*
	 * You are given n pair of numbers, representing the width and height of each envelope.
3. You are required to print the count of maximum number of envelopes that can be nested inside each other.
Note -> Rotation is not allowed.


only diff betwwen this ques and overlappig brdges is that here we do not consider equal , only less width and h is considered.
	 */

	     public static class envlp implements Comparable<envlp>{
	        int w;
	        int h;
	        envlp(int w,int h){
	            this.w = w;
	            this.h = h;
	        }
	        
	        public int compareTo(envlp o){
	                return this.w - o.w;
	        
	        }
	        
	    }
	    

	    public static void main(String[] args) throws Exception {
	        // write your code here
	        Scanner scn = new Scanner(System.in);
	        int m = scn.nextInt();
	        envlp[] envlps = new envlp[m];
	        
	        for(int i = 0; i < m; i++){
	            int w = scn.nextInt();
	            int h = scn.nextInt();
	            envlps[i] = new envlp(w,h);
			}
			scn.close();
			
	        Arrays.sort(envlps);
	        int[] dp = new int[m];
	        dp[0] = 1;
	        int omax = 1;
	        for(int i = 1; i < dp.length; i++){
	            int max = 0;
	            for(int j = i-1; j >= 0; j-- ){
	                if(envlps[j].h < envlps[i].h && envlps[j].w < envlps[i].w){
	                    if(dp[j] > max){
	                        max = dp[j];
	                    }
	                }
	            }
	            dp[i] = max+1;
	            
	            if(dp[i] > omax){
	                omax = dp[i];
	            }
	        }
	        System.out.println(omax);
	    }

	

}
