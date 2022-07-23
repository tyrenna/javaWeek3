package codingassignment;

public class question9 {

	public static void main(String[] args) {
		// Coding Step 9
		
	
		System.out.println((over(null) > 100));
		
	}
	public static  int over (int[] num) {
		int over = 0;
		for (int numbers : num) {
			over += numbers;
		}
		if (over > 100) {
		
		}
		return over;
	}
}
