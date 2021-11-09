import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

	Scanner reader = new Scanner(System.in);
	int accountant = 0;
	int sum = 0;
	int A = 0;
	do {

	    System.out.println("Enter number A: ");

	    A = reader.nextInt();

	    accountant = accountant + 1;
	    sum = sum + A;

	}while(accountant < 10);
	System.out.println("The sum is: "+sum);

    }

}
