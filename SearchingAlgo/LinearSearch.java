package SearchingAlgo;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {34,21,8,10,6};
		int data = 8;
		System.out.println("Element found at "+ linearSearch(arr,data)+" index");
		
	}
	public static int linearSearch(int[] arr,int data) {
		for(int i = 0; i < arr.length; i++) {
			if(data == arr[i]) {
				return i;
			}
		}
		return -1;
	}

}
