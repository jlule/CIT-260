import java.util.Scanner;

/*
 * create a scanner
 * prompt for numbers
 * read the first number
 * max gets number
 * while number not 0
 * 	read the next number
 * 	if number is not 0
 * 	  if number > max
 * 	   	 max gets number
 * 		 count gets 1
 * 		else if number equals max
 *      increment count
 * */
public class A5dot41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//
		System.out.println("Please enter integers followed by 0:");
		int number = input.nextInt();
		int max = number;
		int count = 1;
		// everytime loop runs number is gonna be a new one replaces the number the next time the loop runs.
		while (number != 0 ) {
			number = input.nextInt();
			if (number != 0) {  //don't want number equal to 0 because 0 is the exit number
				if(number > max) {
					max = number; //max gets number
					count = 1;
				}else if(number == max) {
					count ++; //count +=1 or count = count + 1
					
				}
			}
			
		}
		System.out.println("The largest number is " + max);
		System.out.println("It occurs " +  count + " times.");
	}

}
