import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

	Scanner reader = new Scanner(System.in);
	int account = 0;
	int sum = 0;
	int A = 0;

	for (int i = 0; i < 10; i++) {
	    System.out.println("Enter a number: ");
	    A = reader.nextInt();
	    sum = sum + A;
	}
	
	System.out.println("The sum is: " + sum);
	
    } 


}
