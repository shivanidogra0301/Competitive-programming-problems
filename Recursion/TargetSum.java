package Recursion;

import java.util.Scanner;

public class TargetSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        s.close();

		int[] arr= {10,20,30,40,50};
		printSubset(arr,0,0,"",60);
	}
	public static void printSubset(int[] arr,int idx,int sos,String ssf,int target) {
		if(idx==arr.length) {
			if(sos==target)
				System.out.println(ssf);
			return;
		}
		
		printSubset(arr,idx+1,sos+arr[idx],ssf+arr[idx]+", ",target);
		printSubset(arr,idx+1,sos,ssf,target);
		
	}

}
