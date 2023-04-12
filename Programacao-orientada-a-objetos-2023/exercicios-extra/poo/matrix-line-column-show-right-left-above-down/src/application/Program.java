package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type the number of lines for the matrix: ");
		int m = sc.nextInt();
		System.out.println("Type the number of columns for the matrix: ");
		int n = sc.nextInt();
		
		Integer[][] matrix = new Integer[m][n];
		
		System.out.println("Type the numbers to create the matrix");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}			
		}
		
		System.out.println("Tye a number X that is on the matrix");
		int x = sc.nextInt();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == x) { // find positions of this numbers
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("== Left: " + matrix[i][j-1]);
					}
					if (i > 0) {
						System.out.println("== Up: " + matrix[i-1][j]);
					}
					if (j < matrix[i].length-1) {
						System.out.println("== Right: " + matrix[i][j+1]);
					}
					if (i < matrix.length-1) {
						System.out.println("== Down: " + matrix[i+1][j]);
					}
				}
			}
		}	
		
		sc.close();
	}
}
