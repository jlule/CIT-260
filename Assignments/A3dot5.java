import java.util.Scanner;

public class A3dot5 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int day;
		int future;//*elapsed*//
		String date = null;
		System.out.print("Enter today's day : ");
		day = input.nextInt();
		
		System.out.print("Enter the number of days elapsed since today: ");
		
		future = input.nextInt();
		
		
		if(day == 1) {
			 date  = "Monday";
		}
		else if(day == 2) {
			  date = "Tuesday";
		}
		else if(day == 3) {
			date = "Wednesday";
		}
		else if(day == 4) {
			date = "Thursday";
		}
		else if(day == 5) {
			date = "Friday";
		}
		else if(day == 6) {
			date = "Saturday";
		}
		else if (day == 0) {
			date = "Sunday";
		}
		
		
		int y = (day + future)  % 7;
		
		/* 0 + 31  = 31 % 7 == 4 times 3 */
//		String futureday = null;
		
		
		String futureday = "";
		
		if(y == 1) {
			 futureday  = "Monday";
		}
		else if(y == 2) {
			futureday = "Tuesday";
		}
		else if(y == 3) {
			futureday = "Wednesday";
		}
		else if(y == 4) {
			futureday = "Thursday";
		}
		else if(y == 5) {
			futureday = "Friday";
		}
		else if(y == 6) {
			futureday = "Saturday";
		}
		else if (y == 0) {
			futureday = "Sunday";
		}
		     
		
		System.out.println("Today is " + date + " and the future day is " + futureday);
	}

}
