public class Exercise22{

    public static void main(String[] args){

	StringBuilder sb = new StringBuilder("Hello");
	System.out.println("string sb: " + sb);
	sb.append(" World");
	System.out.println("string sb: " + sb);

	sb.append("!") .append(" are") .append(" you?");
	System.out.println("string sb: " + sb);

	sb.insert(12, " How");
	System.out.println("string sb: " + sb);

	//get length
	System.out.println("Length: " + sb.length());

	//get subString
	System.out.println("Sub: " + sb.substring(0, 5));

    }

}
