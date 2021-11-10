import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {

	float note;

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a note: ");
	note = scanner.nextFloat();

	while(note < 0 || note > 10) {
	    System.out.println("Invalid note, enter a new note: ");
	    note=scanner.nextFloat();
	}

	if(note < 5)
	    System.out.println("Suspense");
	else if(note >= 5 && note < 6)
	    System.out.println("Approved");
	else if(note >= 6 && note < 7)
	    System.out.println("Good");
	else if(note >= 7 && note < 8)
	    System.out.println("Notable low");
	else if(note >= 8 && note < 9)
	    System.out.println("Notable high");
	else if(note >= 9 && note < 10)
	    System.out.println("Outstanding");
	else System.out.println("Honor enrollment");
    }

}
