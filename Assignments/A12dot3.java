
import java.util.Random;
import java.util.Scanner;
public class A12dot3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Random r = new Random();
		int[] arr = new int[100];  
		
		for (int i = 0; i < arr.length; i ++) {
			arr[i] = r.nextInt(100);
			
			System.out.println(arr[i]);	
			
		}
		System.out.println("Please enter an index ");
		try {
			
			System.out.println("The corresponding element is " + arr[input.nextInt()]) ;
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Out of Bounds");	
			
		}
		

		
		

	}

}
