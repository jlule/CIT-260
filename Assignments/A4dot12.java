import java.util.Scanner;

public class A4dot12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//
		System.out.println("Enter a  hex digit: ");
		String hex = null;
		hex = input.nextLine();	
		String number = "0";
		
//		When comapring strings use varibale.equals(" value ")
		if(hex.equals("0")) {
			  number = "0000";
			  System.out.println("The binary Value is " + number);
		}
		else if(hex.equals("1")) {
			  number = "0001";
			  System.out.println("The binary Value is " + number);	  
		}
		else if(hex.equals("2")) {
			  number = "0010";
			  System.out.println("The binary Value is " + number);	  
		}
		else if(hex == "3") {
			  number = "0011";
			  System.out.println("The binary Value is " + number);	  
		}
		else if(hex.equals("4")) {
			  number = "0100";
			  System.out.println("The binary Value is " + number);	  
		}
		else if(hex.equals("5")) {
			  number = "0101";
			  System.out.println("The binary Value is " + number);	  
		}
		else if(hex.equals("6")) {
			  number = "0110";
			  System.out.println("The binary Value is " + number);	  
		}
		else if(hex.equals("7")) {
			  number = "0111";
			  System.out.println("The binary Value is " + number);	  
		}
		else if(hex.equals("8")) {
			  number = "1000";
			  System.out.println("The binary Value is " + number);	  
		}
		else if(hex.equals("9")) {
			  number = "1001";
			  System.out.println("The binary Value is " + number);	  
		}
		
		else if(hex.equals("A")) {
			  number = "1010";
			  System.out.println("The binary Value is " + number);	  
		}
		else if(hex.equals("B")) {
			  number = "1011";
			  System.out.println("The binary Value is " + number);


		}
		else if(hex.equals("C")) {
			number = "1100";
			  System.out.println("The binary Value is " + number);

		}
		else if(hex.equals("D")) {
			number = "1101";
			  System.out.println("The binary Value is " + number);

		}
		else if(hex.equals("E")) {
			number = "1110";
			  System.out.println("The binary Value is " + number);

		}
		else if(hex.equals("F")) {
			number = "1111";
			  System.out.println("The binary Value is " + number);

		}
        else {
    	   System.out.println(hex + " is not a valid input! ");
    	   
        }
//		 System.out.println(hex);
//		 System.out.println("The binary Value is " + number);
		

	}

}
