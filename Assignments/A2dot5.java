import java.util.Scanner;

public class A2dot5 {
	public static void main(String[] args) {
		//sub-total and  gratuity rate
		Scanner input = new Scanner(System.in);
		
		//create subtotal and rate variables
		double subtotal;
		double gratuityrate;
		
		//prompt for values
		System.out.print("Enter the subtotal and the gratuity rate: ");
		subtotal = input.nextDouble();
		
//		System.out.print("Enter the gratuityrate: ");
		gratuityrate = input.nextDouble();
		
		//calculate dollar amount of the gratuity
		double gratuity, gratuity1, total;
		gratuity = (gratuityrate/100);  // 0.15
		gratuity1 = gratuity * subtotal; //$1.5
		
		total = gratuity1 + subtotal;  //11.5
		
		System.out.println("The gratuity is $" + gratuity1 + " and the total is $" + total);
		input.close();	
	}
}
