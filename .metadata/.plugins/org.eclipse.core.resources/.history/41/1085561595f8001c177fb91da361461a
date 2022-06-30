package WeekOne;

import java.util.Scanner;

public class WalkOnAxis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many tests?");
		
		// take in the number of tests as an input
		int test = sc.nextInt();
		
		// iterate through the number of tests
		for (int i = 1; i <= test; i++) {
			
			// input for number of lights on
			System.out.println("How many lights are on?");
			int lights = sc.nextInt();
			
			// number of steps required to turn off the lights
			// starts at zero because we haven't taken any steps yet
			int steps = 0;
			
			for (int y = lights; y > 0; y--) {
				steps += y + 1;
			}
			System.out.println("You have to take " + steps + " steps.");
			
		}
		sc.close();

	}

}
