package Recursion;

import java.util.Scanner;

public class LexicographicalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		//write your code here
		
		for(int i = 1; i < 10; i++ ){
		    dfs(i,n);
		}
	}
	
	public static void dfs(int i, int n){
	    if(i > n){
	        return;
	    }
	    System.out.println(i);
	    for(int j = 0; j < 10; j++){
	        dfs(10 * i + j, n);
	    }
	}
	

}
