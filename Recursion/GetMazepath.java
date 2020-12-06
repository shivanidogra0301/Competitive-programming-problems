package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazepath {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
        s.close();

//		ArrayList<String> ans=getMazePath(0,0,n-1,m-1);
//		ArrayList<String> ans=getmazeJump(0,0,n-1,m-1);
//		System.out.println(ans);
//		printmazepath(0,0,n-1,m-1,"");
		printmazejump(0,0,n-1,m-1,"");
	}
	public static ArrayList<String> getMazePath(int r,int col,int n,int m){
		if(r == n && col ==  m) {
			ArrayList<String> bres=new ArrayList<>();
			bres.add("");
			return bres;
		}
		ArrayList<String> hres= new ArrayList<>();
		ArrayList<String> vres= new ArrayList<>();
		if(col<m)
				hres=getMazePath(r,col+1,n,m);
		if(r<n)
				vres=getMazePath(r+1,col,n,m);
		ArrayList<String> myres=new ArrayList<>();
		for( String res:hres) {
			myres.add("H"+res);
		}
		for(String res:vres) {
			myres.add("V"+res);
		}
		return myres;
	}
	public static void printmazepath(int r,int c,int er,int ec,String ans) {
		if(r==er&&c==ec) {
			System.out.println(ans);
			return;
		}
		if(c<ec)
		printmazepath(r,c+1,er,ec,ans+"H");
		if(r<er)
		printmazepath(r+1,c,er,er,ans+"V");
	}

	public static ArrayList<String> getmazeJump(int r,int c,int er,int ec){
		if(r==er&&c==ec) {
			ArrayList<String> bres=new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		ArrayList<String> mypath=new ArrayList<>();
		//Horizontal Path
		for(int i=1;i<=ec-c;i++) {
			ArrayList<String> hpaths=getmazeJump(r,c+i,er,ec);
			for(String path:hpaths) {
				mypath.add("h"+i+path);
			}
		}
		//Vertical Path
				for(int i=1;i<=er-r;i++) {
					ArrayList<String> vpaths=getmazeJump(r+i,c,er,ec);
					for(String path:vpaths) {
						mypath.add("v"+i+path);
					}
				}
				
		//Diagonal Path
				for(int i=1;i<=ec-c&&i<=er-r;i++) {
					ArrayList<String> dpaths=getmazeJump(r+i,c+i,er,ec);
					for(String path:dpaths) {
						mypath.add("d"+i+path);
					}
				}
		return mypath;
	}
	public static void printmazejump(int r, int c, int er, int ec,String ans) {
		if(r==er&&c==ec) {
			System.out.println(ans);
			return;
		}
		for(int i=1;i<=ec-c;i++) {
			printmazejump(r,c+i,er,ec,ans+"H"+i);
		}
		for(int i=1;i<=er-r;i++) {
			printmazejump(r+i,c,er,ec,ans+"V"+i);
		}
		for(int i=1;i<=ec-c&&i<=er-r;i++) {
			printmazejump(r+i,c+i,er,ec,ans+"D"+i);
		}
	}
	
}
