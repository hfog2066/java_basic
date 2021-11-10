import java.util.Scanner;

public class Exercise11{

    public static void main(String[] args){

	int note = 0;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a note: ");
	note = scanner.nextInt();

	switch (note) {
	case 5:
	    System.out.println("Enough");
	    break;
	case 6:
	    System.out.println("Good");
	    break;
	case 7:
	    System.out.println("Notable low");
	    break;
	case 8:
	    System.out.println("Notable high");
	    break;
	case 9:
	    System.out.println("Outstanding");
	    break;
	case 10:
	    System.out.println("Honor enrollment");
	    break;
	default:
	    if( note <  5) System.out.println("Suspense");
	    else System.out.println("Big note");	

	}

    }


}
