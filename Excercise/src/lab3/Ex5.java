package lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex5 {

	public static int findLargestOddDivisor(int n) {
		int largestOddDivisor = 1;
		for (int i = 1; i < n; i++) {
			if ((n % i == 0) && (i % 2 == 1)) {
				largestOddDivisor = i;
			}
		}
		return largestOddDivisor;
	}

	public static boolean checkPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int[] primeFactorization(int n) {
		int[] arr = new int[n];
		int index = 0;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			while (n % i == 0) {
				arr[index++] = i;
				n /= i;
			}
		}
		if (n > 1) {
			arr[index++] = n;
		}
		return Arrays.copyOf(arr, index);
	}

	public static int[] findAllPrimeNumbersLowerThan(int n) {
		List<Integer> primesList = new ArrayList<>();
		for (int i = 2; i < n; i++) {
			if (checkPrime(i)) {
				primesList.add(i);
			}
		}
		int[] primes = new int[primesList.size()];
		for (int i = 0; i < primesList.size(); i++) {
			primes[i] = primesList.get(i);
		}
		return primes;
	}

	public static void main(String[] args) {
		System.out.println(findLargestOddDivisor(36));
		primeFactorization(36);
	}
}
