package codingassignment;

public class question7 {

	public static void main(String[] args) {
		// Coding Step 7

	
		System.out.println(multiplyGreeting("Hello",3));
		
		
	} 

	
	public static String multiplyGreeting(String hello, int hi) {
			String result = "";
			for (int i = 0; i < hi; i++) {
				result += hello;
			}
			return result;
	}
	


}
