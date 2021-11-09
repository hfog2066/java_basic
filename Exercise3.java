import java.util.Scanner;

public class Exercise3 {
    
    public static void main(String[] args) {

	Scanner reader = new Scanner(System.in);
	int number1 = 0;
	int number2 = 0;

	do{
	    System.out.println("Enter number 1: ");
	    number1 = reader.nextInt();
	    System.out.println("Enter number 2: ");
	    number2 = reader.nextInt();
	}while(number1!=number2);
	System.out.println("You're done, the numbers are equal");
	

    }
}
