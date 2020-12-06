package dynamicProgramming;
// we have k-fence and n number of colors, not more than two consecutive fence have same color.
public class PaintFence {

	public static void main(String[] args) {
		int n=8,k=3;
		int same=k,diff=k*(k-1);
		int total=same+diff;
		for(int i=3;i<=n;i++) {
			same=diff;
			diff=total*(k-1);
			total=same+diff;
			
			
		}
		System.out.println("Total ways "+ total);

	}

}
