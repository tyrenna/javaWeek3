package codingassignment;

public class Notes {

	public static void main(String[] args) {
		// Coding Step 3 and 4

		String[] names = new String [6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";

		for (int i = 0; i < names.length; i++){
		
		System.out.println(names[i]);
		}
	
		
		//Enhanced for Loop
		for (String name : names) {
			System.out.println(name);
			
			
			
			// print not println to print on same line
			for (int i = 0; i < names.length; i++){
			
			System.out.print(names[i]);

			}
		}
	}
}
