import java.util.Scanner;

public class A5dot10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//
		int count = 0;
		
		int five;
		int six;
		
		
//		for(int i = 0; i <2; i++) {
			for(int j = 100; j <= 1000; j++) {
				if(j%5 == 0 && j%6 == 0 ) {
					 count++;
					System.out.print(j + " ");
					
					if (count % 10 == 0) {
						System.out.printf("%n");	
					}
//					System.out.print(" \t");
					
					
				}
			}System.out.println(" ");
			
		}
//		for(int j = 100; j <= 1000; j++) {
//			if(j%5 == 0 && j%6 == 0 ) {
//				System.out.print( count++ % 10 == 0 ? (new StringBuilder(String.valueOf(j)))
//				.append("\n").toString():(new StringBuilder(String.valueOf(j)).append(" ").toString()));
//			}
//			
		}
	
	


