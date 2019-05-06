/**
 * @author Martin Coder
 *
 * Implemented using iteration.
 * Used BigInteger class because long isn't large enough for some of the higher fibonacci numbers.
 */

import java.math.BigInteger;

class Problem3 {
	public static void main(String[] args) {
		printFibNumsIter(100);
	} 

	private static void printFibNumsIter(int n) {
		BigInteger prev2 = new BigInteger("0");
		BigInteger prev1 = new BigInteger("0");
		BigInteger next = new BigInteger("0");

		for (int i = 0; i < n; i++) {
			if (i <= 1) {
				next = BigInteger.valueOf(i);
			} else {
				prev2 = prev1;
				prev1 = next;
				next = prev2.add(prev1);
			}
			System.out.print(next.toString());
			if (i < n - 1) {
				System.out.print(", ");
			}
		}
	}
 }
