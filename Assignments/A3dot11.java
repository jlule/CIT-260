import java.util.Scanner;

public class A3dot11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int number = 0;
		int year = 0;
		int days = 0;
		String month = "";
		
		System.out.print("Please enter the month: ");
		number = input.nextInt();
		
		System.out.print("Please enter the year: ");
		year = input.nextInt();
		
		
		boolean isleapyear  = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		if(number == 1) {
			month = "January";
			days = 31;
		}
//		check if it is a leap year!
		
		else if(number == 2 && isleapyear == true) { 
			month = "February";
			days = 29;
			}
//		check if it not a leap year!
		
		else if ( number == 2 && isleapyear == false){
				month = "February";
				days = 28;
			}
		
		else if(number == 3) {
			month = "March";
			days = 31;
		}
		else if(number == 4) {
			month = "April";
			days = 30;
		}
		else if(number == 5) {
			month = "May";
			days = 31;
		}
		else if(number == 6) {
			month = "June";
			days = 30;
		}
		else if(number == 7) {
			month = "July";
			days = 31;
		}
		else if(number == 8) {
			month = "August";
			days = 31;
		}
		else if(number == 9) {
			month = "September";
			days = 30;
		}
		else if(number == 10) {
			month = "October";
			days = 31;
		}
		else if(number == 11) {
			month = "November";
			days = 30;
		}
		else if(number == 12) {
			month = "December";
			days = 31;
		}
		System.out.print( "The month " + month + " and year " + year + " has " + days + " days");

	}

}
