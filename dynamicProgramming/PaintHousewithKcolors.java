package dynamicProgramming;

import java.util.Scanner;
/*- You are given a number n and a number k separated by a space, representing the number of 
 * houses and number of colors.
- In the next n rows, you are given k space separated numbers representing the cost of painting nth house with one of the k colors.
- You are required to calculate and print the minimum cost of painting all houses 
without painting any consecutive house with same color. 
Input : 
4 3
1 5 7
5 8 4
3 2 9
1 2 4
Output: 8 */

public class PaintHousewithKcolors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int k = s.nextInt();
	        
	        int[][] arr = new int[n][k];
	        
	        
	        for(int i = 0; i < n; i++){
	            for(int j = 0; j < k; j++){
	                arr[i][j] = s.nextInt();
	            }
	        }
	        
	        int least = Integer.MAX_VALUE , sleast = Integer.MAX_VALUE;
	        for(int j = 0; j < arr[0].length; j++){
	             if(arr[0][j] <= least){
	                sleast = least;
	                least = arr[0][j];
	            } else if(arr[0][j] <= sleast){
	                sleast = arr[0][j];
	            }
	        }
	        
	        for(int i = 1; i < arr.length; i++){
	            int nleast = Integer.MAX_VALUE, nsleast = Integer.MAX_VALUE;
	            for(int j = 0; j < arr[i].length; j++){
	                if(least == arr[i-1][j]){
	                    arr[i][j] += sleast;
	                }else{
	                    arr[i][j] += least;
	                }
	                
	                if(arr[i][j] <= nleast){
	                    nsleast = nleast;
	                    nleast = arr[i][j];
	                } 
	                else if(arr[i][j] <= nsleast){
	                    nsleast = arr[i][j];
	                }
	                
	                
	            }
	            
	            least = nleast;
	            sleast = nsleast;
	        }
	        
	        System.out.println(least);

	}

}
