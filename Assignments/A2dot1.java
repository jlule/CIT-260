import java.util.Scanner;

public class A2dot1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius: ");
		
		double celsius = input.nextDouble();
		
		double fahrenheit = (9.0 / 5) * celsius + 32;
		
		System.out.print(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
		input.close();
	}
	

}


