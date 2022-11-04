import java.util.Scanner;

public class A12dot5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean done = false;
		while(!done) {
		try { 
	    Scanner input = new Scanner(System.in);
		System.out.println("PLease enter the three sides");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		MyTriangle t = new MyTriangle(s1,s2,s3);
		System.out.println(t);
		done = true;

		}catch(IllegalTriangleException e) {
			System.out.println("Invalid triangle.");
		}catch(InputMismatchException e) {
			System.out.println("Please enter numbers.");

		}

		}
	}

}

class MyTriangle{
	double s1,s2,s3;

	public MyTriangle(double s1, double s2, double s3) throws MyTriangle.IllegalTriangleException {
		super();
		if(s1 + s2 <=s3 || s2 +s3 <= s1 || s3 +s1 <= s2) {
			throw new IllegalTriangleException();
		}
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public double getS1() {
		return s1;
	}

	public void setS1(double s1) {
		this.s1 = s1;
	}

	public double getS2() {
		return s2;
	}

	public void setS2(double s2) {
		this.s2 = s2;
	}

	public double getS3() {
		return s3;
	}

	public void setS3(double s3) {
		this.s3 = s3;
	}
	public String toString() {
		return "Triangle - " +s1 +" - " + s2 + " - " + s3;
	}
	
	class IllegalTriangleException extends Exception{
		 public IllegalTriangleException() {
			 super("Illegal Triangle");
		 }
	}
}