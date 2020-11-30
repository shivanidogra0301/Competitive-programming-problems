package SortingAndSearching;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,2,9,1};
		
		long starttime = System.currentTimeMillis();
		for(int i = 0; i < arr.length-1; i++) {
			for(int j= 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		long endtime = System.currentTimeMillis();
		System.out.println();
		System.out.print("Time "+ (endtime-starttime)+"ms");

	}

}
