package practise01;

import java.util.Scanner;

public class MatrixAdditionAndSubstraction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first matrix row number ");
		int row1 = sc.nextInt();
		System.out.println("Enter first matrix column number ");
		int col1 = sc.nextInt();
		
		System.out.println("Enter second matrix row number ");
		int row2 = sc.nextInt();
		System.out.println("Enter second matrix column number ");
		int col2 = sc.nextInt();
		
		if((row1 == col1) && (row1 == col2)) {
			int a[][] = new int[row1][col1];
			int b[][] = new int[row2][col2];
			
			System.out.println("Enter first matrix element");
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					System.out.println("Enter for " +i+ " , " +j+ " ");
					a[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Enter secod matrix element");
			for(int i=0;i<b.length;i++) {
				for(int j=0;j<b[i].length;j++) {
					System.out.println("Enter for " +i+ " , " +j+ " ");
					b[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Resultant matrix elements");
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					a[i][j] = a[i][j] + b[i][j];
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
			sc.close();
		}
	}
}
