package dynamicProgramming;
import java.util.*;
/*  
 * 1. You are given a number n, representing the number of bridges on a river.
2. You are given n pair of numbers, representing the north bank and south bank co-ordinates of each bridge.
3. You are required to print the count of maximum number of non-overlapping bridges.
 */
public class OverLappingBridges {
	public static class bridge implements Comparable<bridge>{
	        int n;
	        int s;
	        bridge(int n,int s){
	            this.n = n;
	            this.s = s;
	        }
	        
	        public int compareTo(bridge o){
	            if(this.n != o.n){
	                return this.n - o.n;
	            }
	            else{
	                return this.s-o.s;
	            }
	        }
	        
	    }
	    

	    public static void main(String[] args) throws Exception {
	        // write your code here
	        Scanner scn = new Scanner(System.in);
	        int m = scn.nextInt();
	        bridge[] bdgs = new bridge[m];
	        
	        for(int i = 0; i < m; i++){
	            int n = scn.nextInt();
	            int s = scn.nextInt();
	            bdgs[i] = new bridge(n,s);
			}
			scn.close();
			
	        Arrays.sort(bdgs);
	        int[] dp = new int[m];
	        dp[0] = 1;
	        int omax = 1;
	        for(int i = 1; i < dp.length; i++){
	            int max = 0;
	            for(int j = i-1; j >= 0; j-- ){
	                if(bdgs[j].s <= bdgs[i].s){
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


