package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class ClimbingStairs {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
        s.close();

//		ArrayList<String> ans=getstairsPath(n);
//		System.out.println(ans);
		printstairs(n,"");
	}
	public static ArrayList<String> getstairsPath(int n){
		if(n==0) {
			ArrayList<String> bres=new ArrayList<>();
			bres.add("");
			return bres;
		}else if(n<0) {
			ArrayList<String> bres=new ArrayList<>();
			return bres;
		}
		ArrayList<String> path1=getstairsPath(n-1);
		ArrayList<String> path2=getstairsPath(n-2);
		ArrayList<String> path3=getstairsPath(n-3);
		ArrayList<String> myans=new ArrayList<>();
		for( String path:path1) {
			myans.add("1"+path);
		}
		for( String path:path2) {
			myans.add("2"+path);
		}
		for( String path:path3) {
			myans.add("3"+path);
		}
		return myans;
		
	}
	public static void printstairs(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}else if(n<0) {
			return;
		}
		printstairs(n-1,ans+"1");
		printstairs(n-2,ans+"2");
		printstairs(n-3,ans+"3");
	}

}
