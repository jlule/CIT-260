import java.util.Scanner;

public class A2dot2 {
	public static void main(String[] args) {
		//compute the volume of cylinder
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of a cylinder ");
		 double radius = input.nextDouble();
	    System.out.print("Enter the length of a cylinder ");
		 double length = input.nextDouble();
		 
		 double area = radius * radius *Math.PI;
		 double volume = area * length;
		 
		 volume = Math.round(volume * 10.0)/10.0;
		 area = Math.round(area * 10000.0)/10000.0;
		 
		 System.out.println("The area is " + area);
		 System.out.println("The volume is " + volume);
		 input.close();
	}

}
