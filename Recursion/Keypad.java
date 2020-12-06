package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Keypad {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
        s.close();

//		ArrayList<String> ans=getkp(str);
//		System.out.println(ans);
		printkeypad(str,"");
	}
	static String[] kcodes= {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	public static ArrayList<String> getkp(String str){
		if(str.length()==0) {
			 ArrayList<String> bres=new ArrayList<>();
			 bres.add("");
			 return bres;
		}
		char ch =str.charAt(0);
//		System.out.println(ch);
		String ros=str.substring(1);
		ArrayList<String> rres=getkp(ros);
		ArrayList<String> myresult=new ArrayList<>();
		String kstr=kcodes[ch-'0'];
		for(int i=0;i<kstr.length();i++) {
			for(String rstr:rres) {
				myresult.add(kstr.charAt(i)+rstr);
			}
		}
		return myresult;
		
	}
	public static void printkeypad(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=str.charAt(0);
		String ros=str.substring(1);
		String kstr=kcodes[ch-'0'];
		for(int i=0;i<kstr.length();i++) {
			printkeypad(ros, ans+kstr.charAt(i));
		}
		
	}
}
