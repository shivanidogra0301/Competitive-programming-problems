package Recursion;

import java.util.Scanner;

public class PrintPermutations {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
        s.close();

		printPermutation(str,"");
	}
	public static void printPermutation(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<ques.length();i++) {
			char ch=ques.charAt(i);
			String roq=ques.substring(0,i)+ques.substring(i+1);
			printPermutation(roq,ans+ch);
		}
	}

}
