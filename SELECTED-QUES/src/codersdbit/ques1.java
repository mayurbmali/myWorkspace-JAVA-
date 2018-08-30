package codersdbit;

import java.util.Scanner;

public class ques1 {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// long N = scn.nextlong();
		// long arr[] = new long[N];
		// for (long i = 0; i < N; i++) {
		// arr[i] = scn.nextlong();
		// }
		long arr[] = { 63,52,28,72,9,62,79,71,43,15,82,21,10,12,38,96,58,99,59,100,10,38,92,30,24,3,49,17,2,63,54,18, 71,7,65,87,82,31,48,39,100,82,15,60,44,84,43,5,63,17,100,94,62,26,35,29};
		System.out.println(numdivisor(arr));
	}

	public static int numdivisor(long arr[]) {
		long prod = 1;
		for (int i = 0; i < arr.length; i++) {
			prod *= arr[i];
		}
		System.out.println(prod);
		int primes = (int)sieve(prod);
		return primes;

	}

	public static long sieve(long prod) {
		int size=(int)Math.sqrt(prod);
		boolean prime[] = new boolean[size + 1];
		for (int i = 0; i < size+1; i++)
			prime.push_back(true);

		for (int p = 2; p * p <= size; p++) {

			if (prime[p] == true) {

				for (int i = p * 2; i <= size; i += p)
					prime[i] = false;
			}
		}
		long count = 0;
		for (int i = 2; i <= size; i++) {
			if (prime[i] == true && prod % i == 0) {
				count++;
			}
		}
		return count;
	}
}