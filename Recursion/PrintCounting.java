package Recursion;

public class PrintCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
//		PI(n);
//		PD(n);
//		PDI(n);
//		System.out.println(factorial(n));
//		System.out.println(powerl(2,n));
		System.out.println(powerOp(2,n));
	}

	public static void PI(int n) {
		if(n==0) {
			return;
		}
		PI(n-1);
		System.out.println(n);
	}
	public static void PD(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		PD(n-1);
	}
	public static void PDI(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		PDI(n-1);
		System.out.println(n);
	}
	public static int factorial(int n) {
		if(n<=1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	public static int powerl(int x,int n) {
		if(n==0) {
			return 1;
		}
		return x*powerl(x,n-1);
	}
	public static int powerOp(int x,int n) {
		if(n==0) {
			return 1;
		}
		int pnm1=powerOp(x,n/2);
		int xn=pnm1*pnm1;
		if(n%2==1) {
			xn=xn*x;
		}
		return xn;
	}
}
