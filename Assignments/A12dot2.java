
import java.util.Scanner;
public class A12dot2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
//		int i  = 0;
//		int j = 0;
//	    int sum = 0;
//	    int count = 0;
//	    
//	
//		
//		try {
//			System.out.println("Enter the first number");
//			i = input.nextInt();
//			
//			System.out.println("Enter the second number");
//			j = input.nextInt();
//			
//		}
//		
//		
//		catch(java.util.InputMismatchException ime) {
//			System.out.println("You must enter a integer");
////			input.nextLine();
//			
//		}
//	
//		sum = i + j;
//		System.out.println(sum);
		
		int i = 0;
	      int j = 0;
//	      create boolean values set to false
	      boolean num1Valid = false;
	      boolean num2Valid = false;
	      

	      while (num1Valid==false || num2Valid==false) {
	         try {
	           if(num1Valid == false) {
	            System.out.print("Enter an integer for num1: ");
	            i = input.nextInt();
	            System.out.println("The number entered for num1 is " + i);
	            num1Valid = true;
	           }

	           if(num2Valid == false) {
	            System.out.print("Enter an integer for num2: ");
	            j = input.nextInt();
	            System.out.println("The number entered for num2 is " + j);
	            num2Valid = true;
	           }
	         }
	         catch (java.util.InputMismatchException ime) {
	            System.out.println("Try again. (" + "Incorrect input: an integer is required)");
	            input.nextLine();
	         }
	      }
	      input.close();
	      System.out.println("The sum of the two integers is"  + (i + j));
	}
	
	

}