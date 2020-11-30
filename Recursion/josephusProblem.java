package Recursion;

import java.util.Scanner;
/* 
 * He starts executing soldiers from 0th position and proceeds around the circle in clockwise 
     direction.
- In each step, k-1 soldiers are skipped and the k-th soldier is executed.
- The elimination proceeds around the circle (which is becoming smaller and smaller as the 
     executed soldiers are removed), until only the last soldier remains, who is given freedom.
- You have to find the position of that lucky soldier.
*/

public class josephusProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int k = scn.nextInt();
	    System.out.println(solution(n,k));
	}
	
	public static int solution(int n, int k){
	    if(n==1){
	        return 0;
	    }
	    
	    int x = solution(n-1,k);
	    int y = (x+k)%n;
	    
	    return y;
	    
	  }
	 

}
