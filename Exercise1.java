import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args){

	Scanner reader = new Scanner(System.in);
	int number1 = 0;
	int number2 = 0;
	System.out.println("Enter the first number: ");

	number1 = reader.nextInt();
	System.out.println("Enter the second number: ");
	number2 = reader.nextInt();
	int sum = number1+number2;

	System.out.println("The sum of the two numbers is: "+sum);

    }

}
