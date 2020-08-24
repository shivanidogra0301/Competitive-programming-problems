package Recursion;

import java.util.Scanner;

public class EncodingAns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		printencoding(str,"");

	}
	public static void printencoding(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}else if(ques.length()==1) {
			char ch=ques.charAt(0);
			if(ch=='0') {
				return;
			}else {
				int chv=ch-'0';
				char code=(char)('a'+chv-1);
				System.out.println(ans+code);
			}
		}else {
			char ch=ques.charAt(0);
			if(ch=='0') {
				return;
			}else {
				int chv=ch-'0';
				char code=(char)('a'+chv-1);
				String roq=ques.substring(1);
				printencoding(roq,ans+code);
			}
			String ch12=ques.substring(0,2);
			String roq12=ques.substring(2);
			int ch12v=Integer.parseInt(ch12);
			if(ch12v<=26) {
				char ch12c=(char)('a'+ch12v-1);
				printencoding(roq12,ans+ch12c);
			}
			
			
		}
	}

}
