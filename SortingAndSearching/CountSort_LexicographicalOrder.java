package SortingAndSearching;

import java.util.Scanner;

public class CountSort_LexicographicalOrder {
	
	 public static void countSort(int[] arr, int min, int max) {
	     int range = max - min + 1; 
	     int[] farr = new int[range];
	     
	     for(int i = 0; i < arr.length; i++){
	         int index = arr[i] - min;
	         farr[index]++;
	     }
	     
	     for(int i = 1; i < farr.length; i++){
	         farr[i] = farr[i] + farr[i-1]  ;
	     }
	     
	     int[] ans = new int[arr.length];
	     
	     for(int i = arr.length - 1; i >= 0; i--){
	         int val = arr[i];
	         int pos = farr[val - min];
	         int idx = pos - 1;
	         ans[idx] = val;
	         farr[val - min]--;
	     }
	     
	     for(int i = 0; i < arr.length; i++){
	         arr[i] = ans[i];
	     }
	   
	  }
	 public static char[] print(int[] arr) {
		 char[] ans = new char[arr.length];
		    for (int i = 0; i < arr.length; i++) {
		       ans[i] = (char)arr[i];
		    }
		    
		    return ans;
		  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    char[] arr = new char[n];
	    int[] ascii = new int[n];
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    for(int i = 0; i < arr.length; i++) {
	    	arr[i] = scn.next().charAt(0);
	    	ascii[i]  = (int)arr[i]; 
	    	max = Math.max(max, ascii[i]);
		    min = Math.min(min, ascii[i]);
	    }
	    countSort(ascii,min,max);
	    print(ascii);
		
	}

}
