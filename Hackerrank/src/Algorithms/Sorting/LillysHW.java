package Sorting;

import java.util.Scanner;

public class LillysHW {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		
		System.out.println(selectionsort(arr));
	}

	public static int selectionsort(int[] arr) {
		int c = 0;

		int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            c+=j+1-i;
            arr[j+1] = key;
        }
		return -c;
	}

}
