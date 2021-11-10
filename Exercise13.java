import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {

	    int num1, num2;
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Enter first number: ");
	    num1 = scanner.nextInt();

	    System.out.println("Enter second number: ");
	    num2 = scanner.nextInt();

	    if(num1 < num2)
		System.out.println(num1 + " is minor");
	    else if(num1 > num2)
		System.out.println(num2 + " is minor");
	    else System.out.println("They are equal");

	    scanner.close();

	}

}
