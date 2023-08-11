package While;

import Functions.MyIO;

public class fibonacci_sequence_underN {

	public static void main(String[] args) {
		/*Reads an integer n and displays the nth
	     term of the Fibonacci sequence on the screen*/
		int n = MyIO.readInt("N number of the fibonacci sequence: ");
		int result = fibonacci(n);
		System.out.println(n + " number of the the sequence: " + result);
		
	}
	public static int fibonacci(int n) {
		if(n<=0)
			return 0;
		else if(n==1)
			return 1;
		else
			n = fibonacci(n-1) + fibonacci(n-2);
			return n;
	}
}
