package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			String str=s.next();
//			ArrayList<String> ans=getss(str);
//			System.out.println(ans);
			printSS(str,"");
	}
	public static ArrayList<String> getss(String str){
		if(str.length()==0) {
			ArrayList<String> bres=new ArrayList<>();
			bres.add("");
			return bres;
		}
		char c=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> rres=getss(ros);
		ArrayList<String> myresult=new ArrayList<>();
		for(String rstr:rres) {
			myresult.add(""+rstr);
			myresult.add(c+rstr);
		}
		return myresult;
		
	}
	public static void printSS(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);
		String roq=ques.substring(1);
		printSS(roq,ans+"");
		printSS(roq,ans+ch);
	}

}
