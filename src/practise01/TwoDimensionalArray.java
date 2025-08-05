package practise01;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the row number ");
		int row = sc.nextInt();
		System.out.println("Enter the column number");
		int col = sc.nextInt();
		
		int a[][] = new int[row][col];
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++) 
			{
				System.out.println("Enter the elements " +i+ ", " +j+ " ");
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++) 
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
