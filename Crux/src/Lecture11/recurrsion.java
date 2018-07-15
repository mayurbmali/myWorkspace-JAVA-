package Lecture11;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class recurrsion {

	public static void main(String[] args) {
//		int[] arr = { 9, 12, 21, 25, 12, 63,97,100 };
		// allindexbtr(arr, 12, 0, 0);
//		display(allindex(arr, 21, 0, 0));
		// printdiskip(5);
		// printpattern(2,3);
//		reversearray(arr, 0);
			

	}

	public static void Printdecreasing(int num) {
		if (num <= 0) {
			return;
		}
		System.out.println(num);
		Printdecreasing(num - 1);
	}

	public static void Printincreasing(int num) {
		if (num <= 0)
			return;
		Printincreasing(num - 1);
		System.out.println(num);
	}

	public static void di(int num) {
		if (num <= 0)
			return;
		System.out.println(num);
		di(num - 1);
		System.out.println(num);
	}

	public static void printdiskip(int num) {
		if (num <= 0)
			return;
		if (num % 2 != 0)
			System.out.println(num);
		printdiskip(num - 1);
		if (num % 2 == 0)
			System.out.println(num);
	}

	public static void rcbubblesort(int num) {

	}

	public static int factorial(int num) {
		if (num == 0)
			return 1;
		int fnm1 = factorial(num - 1);
		int fn = num * fnm1;
		return fn;
	}

	public static int fibonacci(int num) {
		if (num == 0 || num == 1)
			return num;

		int fnm1 = fibonacci(num - 1);

		int fnm2 = fibonacci(num - 2);
		int fn = fnm1 + fnm2;
		return fn;
	}

	public static int power(int x, int n) {
		if (n == 0)
			return 1;

		int xpnm1 = power(x, n - 1);
		int xpn = x * xpnm1;
		return xpn;
	}

	public static boolean isSorted(int[] arr) {

		if (arr.length == 0)
			return true;
		if (arr[0] > arr[1])
			return false;
		else {
			int[] sa = new int[arr.length - 1];
			for (int i = 1; i < arr.length; i++) {
				sa[i - 1] = arr[i];
			}
			boolean issaSorted = isSorted(sa);
			return issaSorted;
		}

	}

	public static boolean contains(int[] arr, int num) {
		if (arr.length == 0)
			return false;
		if (arr[0] == num)
			return true;
		else {
			int b[] = new int[arr.length - 1];
			for (int i = 1; i < arr.length; i++)
				b[i - 1] = arr[1];
			return contains(b, num);
		}
	}

	public static boolean issortedsmarter(int[] arr, int si) {
		if (si == arr.length - 1)
			return true;
		if (arr[si] > arr[si + 1])
			return false;
		else {
			boolean issasorted = issortedsmarter(arr, si + 1);
			return issasorted;
		}
	}

	public static int firstindex(int[] arr, int num, int si) {
		if (si == arr.length) {
			return -1;
		}

		if (arr[si] == num) {
			return si;
		} else {
			int isContainedInSA = firstindex(arr, num, si + 1);
			return isContainedInSA;
		}
	}

	public static int lastindex(int[] arr, int num, int si) {
		if (si == arr.length)
			return -1;

		int li = lastindex(arr, num, si + 1);
		if (li != -1)
			return li;

		else {
			if (arr[si] == num)
				return si;
			else
				return -1;
		}

	}

	public static int[] allindex(int[] arr, int num, int si, int count) {
		if (si == arr.length)
			return new int[count];

		int[] result = null;
		if (arr[si] == num)
			result = allindex(arr, num, si + 1, count + 1);
		else
			result = allindex(arr, num, si + 1, count);

		if (arr[si] == num) {
			result[count] = si;
		}
		if (result.length == 0 && si == 0)
			System.out.print("-1");

		return result;
	}

	public static void allindexbtr(int[] arr, int num, int count, int si) {
		if (si == arr.length) {

			return;
		}
		if (arr[si] == num) {
			System.out.println(si);
			allindexbtr(arr, num, count + 1, si + 1);
		} else
			allindexbtr(arr, num, count, si + 1);
	}

	public static void Swap(int[] arr, int i, int j) {
		// System.out.println(a + ", " + b);

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + ", ");
		}
		System.out.println("end");
	}

	public static void printpattern(int n, int r) {
		if (n == 0)
			return;
		if (r == 0) {
			System.out.println();
			return;
		}
		printpattern(n - 1, r);
		System.out.print("*");
		printpattern(n, r - 1);

	}
	
	public static void reversearray(int[] arr,int si){
		if(si==arr.length-1){
			System.out.println(arr[si]);
			return;
		}
		reversearray(arr, si+1);
		System.out.println(arr[si]);
		return;
	}

}
