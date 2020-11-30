package SearchingAlgo;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {34,21,8,10,6};
		int data = 8;
		System.out.println("Element found at "+ LinearSearch(arr,data)+" index");
		
	}
	public static int LinearSearch(int[] arr,int data) {
		for(int i = 0; i < arr.length; i++) {
			if(data == arr[i]) {
				return i;
			}
		}
		return -1;
	}

}
