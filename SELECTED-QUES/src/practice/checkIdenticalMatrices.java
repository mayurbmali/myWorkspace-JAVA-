package practice;

import java.util.*;

public class checkIdenticalMatrices {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = scn.nextInt();
		int cols = scn.nextInt();
		int[][] mat1 = new int[rows][cols];
		int[][] mat2 = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				mat1[i][j] = scn.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				mat2[i][j] = scn.nextInt();
			}
		}
		// int[][]mat1 = { {1, 1, 1, 1},
		// {2, 2, 2, 2},
		// {3, 3, 3, 3},
		// {4, 4, 4, 4}};
		//
		// int[][] mat2 = { {1, 1, 1, 1},
		// {2, 2, 5, 2},
		// {3, 3, 3, 3},
		// {4, 4, 4, 4}};
		boolean flag = true;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (mat1[i][j] != mat2[i][j]) {
					flag = false;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("identical");
		} else {
			System.out.println(" not identical");
		}
	}

}
