package codingassignment;

public class question6 {

	public static void main(String[] args) {
			// Coding Step 6 - Attempted both ways but wasn't working total is 23 see #13
			
			
		String[] names = new String [6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		for (int i = 0; i < names.length; i++){
			System.out.print(names[i]);
		}
		
		int sum = 0;
		for (int i = 0; i < names.length; i++){
			sum += names.length;
			
			 System.out.println("sum: " + sum);
		}
		
		
			for (String nameLengths : names) { 
			
			int nameLengths1 = nameLengths.length();
			System.out.println("Length: " + nameLengths1);
		
			}
		}
	}
