package codingassignment;

public class question13 {

	public static void main(String[] args) {
		// This was used as practice to arrive at the same solutions for problem 2


		String names = "SamTommyTimSallyBuckBob";
		int stringlength = names.length();
		System.out.println("Names Length: " + stringlength);
		System.out.println("Names Average: " + stringlength / 6);
		
		// Coding Step 2b other
		
		String[] names1 = new String [6];
		names1[0] = "Sam";
		names1[1] = "Tommy";
		names1[2] = "Tim";
		names1[3] = "Sally";
		names1[4] = "Buck";
		names1[5] = "Bob";

		System.out.println("Names Concatenate: " +
		names1[0] + " " + 
		names1[1] + " " + 
		names1[2] + " " + 
		names1[3] + " " + 
		names1[4] + " " + 
		names1[5]);
		

	}

}
