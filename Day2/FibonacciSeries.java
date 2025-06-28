package Week1.Day2;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		  System.out.print("Enter Range : ");
		  int range =   input.nextInt();
		  int n1=0, n2=1;
		  System.out.print("The Fibonacci Series for the range "+ range + " is : ");
		  for (int i=0; i<range; i++) {
			  System.out.print(n1);
			  int n3 = n2+ n1;
			  n1=n2;
			  n2=n3;
			  
		  }
	}

}
