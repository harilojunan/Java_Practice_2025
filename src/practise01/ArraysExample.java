package practise01;

import java.util.Scanner;

public class ArraysExample {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];
		System.out.println("Enter array elements ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
				
		int max = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println("Max number is :" +max);
		
		int min = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("Minimum number is :" +min);
		sc.close();
	
	}

}
