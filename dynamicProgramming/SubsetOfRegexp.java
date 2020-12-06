package dynamicProgramming;
//find the subsets for a+b+c+ means a can come 1 or more
public class SubsetOfRegexp {
    public static void main(String[] args) {
		String str="abcabc";
		int a=0,ab=0,abc=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				a=2*a+1;
			}else if(str.charAt(i)=='b') {
				ab=2*ab+a;
			}else {
				abc=2*abc+ab;
			}
		}
		System.out.println(abc);
	}
}
