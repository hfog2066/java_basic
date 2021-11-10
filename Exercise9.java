import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {

	int sum = 0;
	int positives = 0;
	int negatives = 0;
	int A = 0;

	Scanner reader = new Scanner(System.in);

	for(int i=0; i<10; i++){
	    System.out.println("Enter a number: ");
	    A = reader.nextInt();
	    if (A >= 0)
		positives++;
	    else
		negatives--;
	    sum = sum + A;		

	}
	System.out.println("The sum is: "+positives);
	System.out.println("The positive numbers is: "+positives);
	System.out.println("The negatives numbers is: "+negatives);	    

    }

}
