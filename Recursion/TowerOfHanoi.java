package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		toh(n,10,11,12);
		

	}
	public static void toh(int n,int tn1,int tn2,int tn3) {
		if(n==0) {
			return;
		}
		toh(n-1,tn1,tn3,tn2);
		System.out.println(n+"["+tn1+" => "+ tn2+"]");
		toh(n-1,tn3,tn2,tn1);
		
	}

}
