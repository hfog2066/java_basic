import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args){

	Scanner reader = new Scanner(System.in);
	int number1 = 0;
	int number2 = 0;

	System.out.println("Enter the first number: ");

	number1 = reader.nextInt();
	System.out.println("Enter the second number: ");
	number2 = reader.nextInt();

	if (number1 > number2)
	    System.out.println("Number 1: "+number1+ " is greater than Number 2: "+number2);
	else if (number1 == number2)
	    System.out.println("Number 1 is equal to number 2");
	else System.out.println("Number 2: "+number2+" is greater than number 1: "+number1);
    }


}
