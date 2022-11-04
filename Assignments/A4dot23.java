import java.text.DecimalFormat;
import java.util.Scanner;


public class A4dot23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);//
		String name = "";
		double hours;
		double hourly_rate;
		double federal;
		double state;
		
		
		System.out.println("Enter the employee's name: ");
		 name= input.next();
		System.out.println("Enter number of hours worked: ");
		 hours = input.nextDouble();
		System.out.println("Enter hourly pay rate: ");
		hourly_rate = input.nextDouble();
		System.out.println("Enter fedral tax withholding rate: " );
		federal = input.nextDouble();
		System.out.println("Enter state tax withholding rate: ");
		state = input.nextDouble();
		
		// calculate the gross pay
		double gross = hours * hourly_rate;
		double federal_with =  federal * gross; 
//		double state_with =  (double)Math.round(state * gross);
		double state_with =  (state * gross);

		double total_Deductions = federal_with + state_with;
		double net_pay = gross - federal_with - state_with;
//		DecimalFormat f = new DecimalFormat("##.00");
		
		
		System.out.println("Employee Name: "+ name);
		System.out.println("Hours Worked: "+ hours);
		System.out.println("Pay Rate: $"+ hourly_rate);
		System.out.println("Gross Pay: $"+ gross);
		System.out.println("Deductions: ");
		System.out.println("  Federal Withholding (20.0%): $"+ federal_with);
//		System.out.println("  State Withholding (20.0%): "+ f.format(state_with));
		System.out.println("  State Withholding (9.0%): $"+ state_with);
		System.out.println("  Total Deductions: $"+ total_Deductions);
		System.out.println("Net Pay: $"+ net_pay);

		
		
		

		
		


	}

}
