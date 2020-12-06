package dynamicProgramming;

public class CountBinaryStrings {
    public static void main(String[] args) {
        int n=3;
		int pre0=1;
		int pre1=1;
		int cur0=0,cur1=0;
		for(int i=2;i<=n;i++) {
			cur1=pre0+pre1;
			cur0=pre1;
			pre0=cur0;
			pre1=cur1;
		}
		int ans=cur1+cur0;
		System.out.println(ans);
    }
}
