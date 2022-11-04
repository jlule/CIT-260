import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class A13dot4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 0;
		int year = 0;
		GregorianCalendar c;
		if(args.length == 2) {
			 month = Integer.parseInt(args[0])-1;
			 year = Integer.parseInt(args[1]);
		}else {
			c = new GregorianCalendar();
			if(args.length == 1) {
				month = Integer.parseInt(args[0]) - 1;
			}else {
				month = c.get(Calendar.YEAR);
			}
			year = c.get(Calendar.YEAR);
		}
		c = new GregorianCalendar(year, month, 1);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		int daysOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		String monthName = new SimpleDateFormat("MMMM").format(c.getTime());
		
		System.out.println("     "+monthName+ " - " + year);
		System.out.println("----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat ");
		for(int i = 1; i < dayOfWeek; i++)
			System.out.print("    ");
		for(int i = 1; i <=daysOfMonth; i++) {
			System.out.printf("%4d", i);
			if((dayOfWeek + i - 1 )%7 == 0) {
				System.out.println();

			}

			
		}




//		System.out.println(month + " - " + year);
	}

}
