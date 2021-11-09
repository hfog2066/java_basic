import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

	Scanner reader = new Scanner(System.in);
	int N = 0;

	System.out.println("Enter a number: ");
	N = reader.nextInt();

	if (N == 1)
	    System.out.println("Today is Sunday" );
	else if (N == 2)
	    System.out.println("Today is Monday" );
	else if (N == 3)
	    System.out.println("Today is Tuesday" );
	else if (N == 4)
	    System.out.println("Today is Wednesday" );
	else if (N == 5)
	    System.out.println("Today is Thursday" );
	else if (N == 6)
	    System.out.println("Today is Friday" );
	else if (N == 7)
	    System.out.println("Today is Saturday" );
	else
	    System.out.println("Invalid number" );

    }

}
