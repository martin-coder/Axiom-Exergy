/**
 * @author Martin Coder
 *
 * For this problem, I assumed list to mean array. Any type of array can be used.
 * I also assumed the arrays would always be the same length to keep the code short.
 */

import java.util.Arrays;

class Problem2 {
	public static void main(String[] args) {

		// Feel free to make your own arrays to try it out!
		// They must be the same length as each other.
		Object[] a = {'a', 'b', 'c'};
		Object[] b = {1, 2, 3};

		System.out.println("Array 1:  " + Arrays.toString(a));
		System.out.println("Array 2:  " + Arrays.toString(b));
		System.out.println("Combined: " + Arrays.toString(combineArr(a, b)));
	}

	private static Object[] combineArr(Object[] a, Object[] b) {
		if (a.length != b.length) {
			throw new IllegalArgumentException( "Arrays must be of equal length" );
		}

		Object[] combined = new Object[a.length * 2];
		int i = 0;
		int j = 0;

		while (j < a.length) {
			combined[i] = a[j];
			combined[i + 1] = b[j];

			i += 2;
			j++;
		}
		return combined;
	}
}
