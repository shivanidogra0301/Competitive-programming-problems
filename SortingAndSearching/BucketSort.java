package SortingAndSearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// this is used when we want to sort floating number from range 0.0 to 0.9
public class BucketSort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long starttime = System.currentTimeMillis();
		float[] arr = new float[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = s.nextFloat();
		}
        s.close();

		ArrayList<Float>[] bucket = new ArrayList[n];
		for(int i = 0; i < bucket.length; i++) {
			bucket[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < arr.length; i++) {
			int idx = (int)arr[i] * n;
			bucket[idx].add(arr[i]);
		}
		for(int i = 0; i < bucket.length; i++) {
			Collections.sort(bucket[i]);
		}
		int index = 0;
		for(int i = 0; i < bucket.length; i++) {
			for(int j = 0; j < bucket[i].size(); j++) {
				arr[index] = bucket[i].get(j);
				index++;
			}
		}
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		long endtime = System.currentTimeMillis();
		System.out.print("Time "+ (endtime-starttime)+"ms");
		
	}
}
