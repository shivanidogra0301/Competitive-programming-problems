package SortingAndSearching;

import java.util.Scanner;

public class ShellSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
        s.close();

		for(int gap = n/2; gap >=1; gap = gap/2) {
			for(int j = gap; j < n ; j++) {
				for(int i = j - gap; i >= 0; i= i-gap) {
					if(arr[i] < arr[i+gap]) {
						break;
					}else {
						int temp = arr[i];
						arr[i] = arr[i+gap];
						arr[i+gap] = temp;
					}
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
