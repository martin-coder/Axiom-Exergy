/**
 * @author Martin Coder
 *
 * For this problem I assumed numbers to mean integers, and list to mean array.
 * Thus, these methods will not work on anything that is not an array of integers.
 *
 * Feel free to test out the code!
 */

import java.util.Arrays;

class Problem1 {
	public static void main(String[] args) {
		// Plug in your own numbers!
		int[] arr1 = {3, 4, 5, 6, 7, 8};
		int[] arr2 = {};
		int[] arr3 = {0, 0, 0, 0, 0, 1};

		System.out.println("arr1: " + Arrays.toString(arr1));
		System.out.println("arr2: " + Arrays.toString(arr2));
		System.out.println("arr3: " + Arrays.toString(arr3));

		System.out.println("Sum of arr1, using for-loop:\t" + computeSumFor(arr1));
		System.out.println("Sum of arr1, using while-loop:\t" + computeSumWhile(arr1));
		System.out.println("Sum of arr1, using recursion:\t" + computeSumRecur(arr1));

		System.out.println();

		System.out.println("Sum of arr2, using for-loop:\t" + computeSumFor(arr2));
		System.out.println("Sum of arr2, using while-loop:\t" + computeSumWhile(arr2));
		System.out.println("Sum of arr2, using recursion:\t" + computeSumRecur(arr2));

		System.out.println();

		System.out.println("Sum of arr3, using for-loop:\t" + computeSumFor(arr3));
		System.out.println("Sum of arr3, using while-loop:\t" + computeSumWhile(arr3));
		System.out.println("Sum of arr3, using recursion:\t" + computeSumRecur(arr3));
	}

	private static int computeSumFor(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	private static int computeSumWhile(int[] arr) {
		int sum = 0;
		int i = 0;
		while (i < arr.length) {
			sum += arr[i];
			i++;
		}
		return sum;
	}

	private static int computeSumRecur(int[] arr) {
		if (arr.length == 0) {
			return 0;
		}

		return arr[0] + computeSumRecur(Arrays.copyOfRange(arr, 1, arr.length));
	}
}
