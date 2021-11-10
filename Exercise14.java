import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {
	int account = 0;
	int sum = 0;
	int positive = 0;
	int negative = 0;
	int A = 0;
	Scanner reader = new Scanner(System.in);


	do {
	    System.out.println("Enter a number: ");
	    A = reader.nextInt();
	    account++;
	    if(A >= 10) positive++;
	    else negative--;
	    sum = sum + A;
	    
	}while(account < 10);
	System.out.println("The sum is: "+sum);
	System.out.println("The positive numbers is: "+positive);
	System.out.println("The negative numbers is: "+negative);


    } 

}
