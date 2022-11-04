import java.util.Scanner;

public class A3dot19 {

	public static void main(String[] args) {
		// Create a triangle 
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter side 1: ");
		double x = input.nextDouble();
		System.out.print("Please enter side 2: ");
		double y = input.nextDouble();
		System.out.print("Please enter side 3: ");
		double z = input.nextDouble();
		
if(x + y > z && y+z > x && z + x > y) {
			double perimeter = x + y + z;
			System.out.println("The perimeter is " + perimeter);
		} else {
			System.out.println("Sorry that would be a black hole.");
		}
		input.close();
	
	}

}
