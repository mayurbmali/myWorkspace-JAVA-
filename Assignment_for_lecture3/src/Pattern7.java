import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the no");
		int n = scn.nextInt(), row = 1, j = 1, i = 1;
		while (row <= n) {

			for (j = 1; j <= n - row; j++) {
				System.out.print(" "+"\t");

			}
			j = row;
			while (j <= 2 * row - 1) {
				if (j == 1) {
					System.out.print(j+"\t");
					j++;
				} else {
					System.out.print(j+"\t");
					j++;
				}
			}
			j = j - 2;
			while (j >= row) {
				System.out.print(j+"\t");
				j--;
			}

			row++;

			System.out.print("\n");
		}

		while (row <= 2 * n - 1) {
			while (i <= row - n) {
				System.out.print(" "+"\t");
				i++;
			}
			j++;
			i = 1;
			while (i <= 2 * n - row) {
				if (j == 1) {
					System.out.print(j+"\t");
					j++;
					break;
				}
				else{
				System.out.print(j - 1+"\t");
				j++;
				i++;}
			}
			i = 1;
			j = j - 2;
			while (i <= 2 * n - row - 1) {
				  
					System.out.print(j-1+"\t");
					j--;
					i++;
				
			}
			i = 1;
			row++;
			j--;
			System.out.print("\n");
		}

	}

}
