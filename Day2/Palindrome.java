package Week1.Day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int input = 123; 
	     int originalInput = input;
	     int output = 0;
	     for (int i = input; i > 0; i = i / 10) {
	            int rem = i % 10;
	            output = output * 10 + rem;
	        }

	        if (originalInput == output) {
	            System.out.println("It is a Palindrome");
	        } else {
	            System.out.println("It is NOT a Palindrome");
	        }
	}

}
