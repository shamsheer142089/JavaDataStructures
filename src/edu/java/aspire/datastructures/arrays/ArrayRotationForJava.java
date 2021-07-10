/**
 * 
 */
package edu.java.aspire.datastructures.arrays;

/**
 * @author Admin
 *
 */
public class ArrayRotationForJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size=10;
		int rotateBy=6;
		int array[] = null;
		rotateArray(array,size,rotateBy);
	}

	private static void rotateArray(int[] array, int size, int rotateBy) {
		array = new int[size];
		addElementToArray(array, size);
		System.out.println("Before Rotation");
		display(array);
		rotate(array, size, rotateBy);
		System.out.println("After Rotation");
		display(array);
	}

	/**
	 * @param array
	 * @param size
	 * @param rotateBy
	 */
	private static void rotate(int[] array, int size, int rotateBy) {
		int initialCount=0;
		while(rotateBy>0) {
			int temp = array[initialCount];
			array[initialCount] = array[size-rotateBy];
			array[size-rotateBy]=temp;
			rotateBy--;
			initialCount++;
			
		}
	}

	private static void display(int[] array) {
		for(int idx=0;idx<array.length;idx++) {
			System.out.println(array[idx]);
		}
	}

	private static void addElementToArray(int[] array, int size) {
		for(int i=0 ;i<size;i++) {
			array[i]=i;
		}
	}

}
