package dynamicProgramming;
import java.util.Scanner;
public class LongestBitonincSubsequence {
	
/*
 * You are required to print the length of longest bitonic subsequence of array.
Note -> bitonic subsequence begins with elements in increasing order, followed by elements in decreasing order.
 */
	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        s.close();

        int[] dpl = new int[n];
        
        dpl[0] = 1;
        for(int i = 1; i < n; i++){
            int max = 0;
            for(int j = i-1; j >= 0; j--){
                if(arr[j] < arr[i]){
                    if(dpl[j] > max){
                        max = dpl[j];
                    }
                }
            }
            dpl[i]  = max + 1;
        }
        
        int[] dpr = new int[n];
        dpr[n-1] = 1;
        for(int i = n-2; i >= 0; i--){
            int max = 0;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[i]){
                    if(dpr[j] > max){
                        max = dpr[j];
                    }
                }
            }
            dpr[i]  = max + 1;
        }
        
        int omax = 0;
        for(int i = 0; i < dpr.length; i++){
            int sum = dpr[i] + dpl[i] - 1;
            if(sum > omax){
                omax = sum;
            }
        }
        System.out.println(omax);
        
    }
}
