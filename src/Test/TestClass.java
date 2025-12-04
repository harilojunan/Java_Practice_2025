package Test;

import java.util.stream.Stream;

public class TestClass {
	
	/*	
	The Fibonacci Sequence is an infinite series that begins with 0, 1, 1, and then each successive integer is the sum of the previous two integers.
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

	Create a function that takes a parameter and sums all of the even numbers in the Fibonacci Sequence up to and including the parameter.

	Examples:
	FibSum(5) = 2
	FibSum(8) = 10
	FibSum(9) = 10

	FibSum(20) = 10

	FibSum(36) = 44
	*/
		
	public static int fibiSum(int num) {
		int a = 0; 
		int b = 1;
		int sum = 0;
		
		while(a <= num) {
			if(a % 2 ==0) {
				sum += a;
			}
			
			int next = a+b;
			a = b;
			b = next;
		}
	
		return sum;
	}
	
	public static int fibSum(int n) {
        return Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .map(f -> f[0])  
                .takeWhile(f -> f <= n)    
                .filter(f -> f % 2 == 0)   
                .mapToInt(Integer::intValue)
                .sum();
    }
	
	public static int fibSumOptimized(int n) {
	    
	    int prev = 0;
	    int curr = 2;  // Start with first even Fibonacci (2)
	    int sum = 0;
	    
	    while (curr <= n) {
	        sum += curr;
	        // Every 3rd Fibonacci is even: F(n+3) = 4*F(n) + F(n-3)
	        int next = 4 * curr + prev;
	        prev = curr;
	        curr = next;
	    }
	    
	    return sum;
	}

	public static void main(String[] args) {
		
//		System.out.println(fibiSum(5));	
//		System.out.println(fibiSum(8));	
//		System.out.println(fibiSum(9));	
//		System.out.println(fibiSum(20));	
//		System.out.println(fibiSum(36));	
	
//		System.out.println(fibSum(5));	
//		System.out.println(fibSum(8));	
//		System.out.println(fibSum(9));	
//		System.out.println(fibSum(20));	
//		System.out.println(fibSum(36));	
		
		System.out.println(fibSumOptimized(5));	
		System.out.println(fibSumOptimized(8));	
		System.out.println(fibSumOptimized(9));	
		System.out.println(fibSumOptimized(20));	
		System.out.println(fibSumOptimized(36));	
	}
}
