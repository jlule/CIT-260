import java.util.Date;
public class A9dot3 {
	
	int x;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 long i = 0;
		    java.util.Date date = new java.util.Date(i);


		    for (i = 10000; i < 1000000000000L; i *= 10) {
		        date.setTime(i);

		        System.out.println("Time elapsed: " + i);
		        System.out.println("Date and time: " + date.toString());
		    }


		    }

	}


