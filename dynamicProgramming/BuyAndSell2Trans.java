package dynamicProgramming;

import java.util.Scanner;
//input 
//9 11 6 7 19 4 1 6 18 4

public class BuyAndSell2Trans {

	public static void main(String[] args) {
		// to find the max profit when two transaction is allowed
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        
        int[] arr = new int[n];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        
        int[] dpl = new int[n];
        dpl[0] = 0;
        int lsf = arr[0];
        for(int i = 1; i < dpl.length; i++){
            if(arr[i] < lsf){
                lsf = arr[i];
            }
            dpl[i] = Math.max(dpl[i-1] , arr[i] - lsf);
        }
        
        int[] dpr = new int[n];
        int msf = arr[dpr.length - 1];
        dpr[dpr.length - 1] = 0;
        for(int i = dpr.length - 2; i >= 0; i--){
            if(arr[i] > msf){
                msf = arr[i];
            }
            dpr[i] = Math.max(dpr[i+1],  msf - arr[i]);
        }
        int op = Integer.MIN_VALUE;
        for(int i = 0; i < dpr.length; i++){
            if(dpl[i] + dpr[i] > op){
                op = dpl[i] + dpr[i];
            }
            
        }
        
        System.out.println(op);
        

	}

}
