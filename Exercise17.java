public class Exercise17{

    public static void main(String[] args){

	String color = "Blue";
	String shirt = " Shirt";

	switch (color){
	case "Blue":
	    shirt = "Blue" + shirt;
	    break;
	case "Red":
	    shirt = "Red" + shirt;
	default:
	    shirt = "White" + shirt;

	}

	System.out.println("Shirt type: " + shirt);

    }


}
