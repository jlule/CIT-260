import java.util.Scanner;

public class A6dot8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		 for (double c = 40, f = 120; c > 30; c--, f -=10) {
			 double far = celsiusToFahrenheit(c);
			 double celsius = fahrenheittoCelsius(f);
			 
			 System.out.printf("\n%.2f\t\t%.2f\t\t|\t%.2f\t\t\t%.2f", c, far, f, celsius);
		 }
		
	}
	public static double celsiusToFahrenheit( double celsius) {
		double far = (9.0/5)* celsius + 32;
		
		
		return far;
		
	}
	
	public static double fahrenheittoCelsius(double fahrenheit) {
		Scanner input = new Scanner(System.in);

		
		double celsius = (5.0 /9) * (fahrenheit - 32);
		
		return celsius;
		
	}

}
