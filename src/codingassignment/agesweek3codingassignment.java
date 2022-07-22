package codingassignment;

public class agesweek3codingassignment {

	public static void main(String[] args) {
		// Coding Step 1a

		int [] ages = { 3, 9, 23, 64, 2, 8, 28, 93};
		int sub = ages[ages.length - 1] - ages [0];
		System.out.println(sub);
		printAge();
		printloop();
	}
	
	public static void printAge() {
		// Coding Step 1b

		int [] ages1 = { 2, 8, 20, 12, 4, 62, 10, 22, 16, 100};
		int sub1 = ages1[ages1.length - 1] - ages1 [0];
		System.out.println(sub1);
		}
	public static void printloop() {
		// Coding Step 1c

		int [] ages2 = { 3, 9, 23, 64, 2, 8, 28, 93};
		
		double avg = 0;
		for (int age : ages2) {
			avg += age;
		}
		avg /= ages2.length;				
			System.out.println(avg);
		
	
		}
}
