import java.util.Scanner;

public class A6dot7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		 System.out.print("Enter present value: ");
		  double investmentAmount=input.nextDouble();
			 System.out.print("Enter the interest rate: ");
			 double monthlyInterestRate=input.nextDouble();
		
			 
				System.out.println("Years" + "       " + "Future Value");
				
				 for(int i = 1; i<=30; i++) {
//					 interest rate divided by 1200 because monthly rate / 100% and divided by 12 months and i is years * 12 to get number of months
					future(investmentAmount, monthlyInterestRate, i); 
					System.out.printf("%5d\t\t%6.1f\n",i, future(investmentAmount, monthlyInterestRate, i));
					
					
				 }
//				future(investmentValue,monthlyInterestRate, i );
		
		// TODO Auto-generated method stub		
		
//ask for input	
		
//		System.out.println("The amount invested: ");
//		amount = input.nextDouble();
//		
//		System.out.println("Annual Interest rate: ");
//		percent = input.nextDouble();
		
//		call the method above;
		
		
	}
	
	public static double future( double investmentAmount, double monthlyInterestRate, int years) {
		Scanner input = new Scanner(System.in);
		
		double futureValue;
//		calculate the investment value

		futureValue = investmentAmount *Math.pow((1+monthlyInterestRate/1200),years *12);
		 

			
			return futureValue;
			
	}

}
