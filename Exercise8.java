import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
	int account = 0;
	int sum = 0;
	int positives = 0;
	int negatives = 0;
	int A = 0;

	Scanner reader = new Scanner(System.in);

	do {
	    System.out.println("Enter a number: ");
	    A = reader.nextInt();
	    account++;
	    if (A >= 0)
		positives++;
	    else
		negatives--;
	    sum = sum + A;
	} while (account < 10);
	System.out.println("The sum is: "+sum);
	System.out.println("The positives number is: "+positives);
	System.out.println("The negatives number is: "+negatives);	

    }

}
