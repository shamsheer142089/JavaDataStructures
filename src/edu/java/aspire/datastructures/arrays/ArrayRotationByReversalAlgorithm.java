/**
 * 
 */
package edu.java.aspire.datastructures.arrays;

/**
 * @author Admin
 *
 */
public class ArrayRotationByReversalAlgorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7 };
		int size=arr.length;
		int rotateCount=7;
		System.out.println("Before Rotation");
		display(arr);
		rotate(arr,size,rotateCount);
		System.out.println("After Rotation");
		display(arr);
	}

	private static void rotate(int[] arr, int size, int rotateCount) {
		if(rotateCount == 0)
			return;
		if(rotateCount >= size)
			rotateCount = rotateCount % size;
		reverse(arr,0,rotateCount-1);
		reverse(arr,rotateCount ,size-1);
		reverse(arr,0,size-1);
					
	}

	private static void reverse(int[] arr, int startIdx, int endIdx) {
		while(startIdx < endIdx) {
			int temp = arr[startIdx];
			arr[startIdx]=arr[endIdx];
			arr[endIdx]=temp;
			startIdx++;
			endIdx--;
		}
	}

	private static void display(int[] arr) {
		int idx=0;
		while(idx<arr.length) {
			System.out.println(arr[idx]);
			idx++;
		}
		
	}

}
