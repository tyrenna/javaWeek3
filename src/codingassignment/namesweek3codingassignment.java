package codingassignment;

public class namesweek3codingassignment {

	public static void main(String[] args) {
		// Coding Step 2a


		String names = "SamTommyTimSallyBuckBob";
		int stringlength = names.length();
		System.out.println("Names Length: " + stringlength);
		System.out.println("Names Average: " + stringlength / 6);
		
		// Coding Step 2b
		
		String[] names1 = new String [6];
		names1[0] = "Sam";
		names1[1] = "Tommy";
		names1[2] = "Tim";
		names1[3] = "Sally";
		names1[4] = "Buck";
		names1[5] = "Bob";

		for (int i = 0; i < names1.length; i++){
			
			System.out.print(names1[i]);
		
		
		
		}

	}

}
