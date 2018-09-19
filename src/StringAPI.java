
public class StringAPI {

	public static void main(String[] args) {
		String river = "Mississippi";
		String greetings = "Hello, world";
		int stringLength = river.length();
		String newRiver = river.replace("p", "s");
		
		System.out.println("The length of the word Mississippi is " + stringLength + ".");
		System.out.println(greetings.toUpperCase());
		System.out.println(newRiver);
		System.out.println(river.toUpperCase());
	}

}
