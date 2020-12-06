package SearchingAlgo;
//Pair of integers having least GCD among all given pairs having GCD exceeding K
/* 
 * Given an array arr[][] containing pairs of integers in increasing order of GCDs, 
 * and an integer K, the task is to find a pair of integers whose GCD is at least K and 
 * is also the least among all possible GCDs exceeding K. If there exists no such pair, 
 * then print -1.
 * here we can see gcd are in inc order,we can use binary search
 */
public class LeastGCD {
	public static int GCD(int x,int y) {
		int ans = 0;
		for(int i = 1; i <= x&& i <= y; i++) {
			if(x%i == 0 && y%i == 0) {
				ans = i;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int [][]arr = {{3, 6},
                {15, 30},
                {25, 75},
                {30, 120}};
		int K = 16;
		int[] ans = {-1,0};
		int lo = 0, hi = arr.length-1;
		while(lo <= hi) {
			int mid = lo+(hi-lo)/2;
			if(GCD(arr[mid][0],arr[mid][1]) >= K) { //means the ans will be either this or in left part
				ans[0] = arr[mid][0];
				ans[1] = arr[mid][1]; //update the ans
				hi = mid -1; // chech in lower part
			}
			else {
				lo = mid+1; //check in higher part
			}
		}
		
		if(ans[0] == -1) {
			System.out.println(ans[0]);
		}else {
			System.out.println(ans[0]+" "+ans[1]);
		}
	}

}
