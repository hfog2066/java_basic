import java.util.Scanner;

public class Exercise7{

    public static void main(String[] args) {

	Scanner reader = new Scanner(System.in);
	int N;

	System.out.println("What day of the week do you want?");
        N = reader.nextInt();
	switch (N) {
	case 1:
	    System.out.println("Sunday");
	    break;
	case 2:
	    System.out.println("Monday");
	    break;
	case 3:
	    System.out.println("Tuesday");
	    break;
	case 4:
	    System.out.println("Wednesday");
	    break;
	case 5:
	    System.out.println("Thrusday");
	    break;
	case 6:
	    System.out.println("Friday");
	    break;
	case 7:
	    System.out.println("Saturday");
	    break;
	default:
	    System.out.println("Invalid number, leaving...");
	    return;	    

	}

    }

}
