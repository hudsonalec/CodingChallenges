package WeekOne;

import java.util.Scanner;

public class NameIsMine {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many tests are there?");
		int test = sc.nextInt();
		
		for (int i = 1; i <= test; i++) {
			
			// take in the names
			System.out.println("First Name?");
			
			String firstName = sc.next();
			
			System.out.println();
			System.out.println("Second Name?");
			
			String secondName = sc.next();
			
			int matching = 0;
			int placeholder = 0;
			
			for (int y = 0; y < firstName.length(); y++) {
				for (int x = placeholder; x < secondName.length(); x++) {
					if (firstName.charAt(y) == secondName.charAt(x)) {
						matching++;
						placeholder = x;
						break;
					}
				}
			}
			if (matching == firstName.length()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
		
		

	}

}
