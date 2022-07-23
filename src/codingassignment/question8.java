package codingassignment;

public class question8 {

	public static void main(String[] args) {
		// Coding Step 8
		
		String firstName = "Tyrenna";
		String lastName = "Gaines";
		String fullName = createFullName(firstName, lastName);
		
		System.out.println(fullName);
	}

	public static String createFullName(String x, String y) {
	String fullName = x + " " + y;
	return fullName;
	
	
	}
}
