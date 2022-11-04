import java.util.Scanner;

public class A5dot3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//
		int kg = 1;
		double pds = 2.2;
		System.out.println("Kilograms" + "       " + "Pounds");
		for(int i = 0; kg <= 200; i++) {
			System.out.printf("%5d\t\t%6.1f\n",kg ,(kg * pds)  );
			kg = kg + 2;
			
			

		}

	}

}

//math.round(kg*100.00)/100.00
//kg(10.0)
