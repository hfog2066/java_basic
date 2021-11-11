public class Exercise21{

    public static void main(String[] args){

	char letter = 'a';

	String string1 = "Hello";
	String string2 = " World";
	String string3 = "";
	String dontDoThis = new String ("Bad practice");

	string3 = string1 + string2; //concatenate strings

	System.out.println("Output: " + string3 + " " + letter);

    }

}
