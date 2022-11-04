import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class A12dot15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = new File("Data.txt");
			writeData(f);
			int[] myList = readData(f);
			Arrays.sort(myList);
			printData(myList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	private static void writeData(File f) throws Exception {
		// TODO Auto-generated method stub
		try(PrintWriter output = new PrintWriter(f)){
			for(int i = 0; i < 100; i++) {
				output.print((int)(Math.random() * 100)+ " ");
			}
		}
		
	}

	private static int[] readData(File f) throws exception {
		// TODO Auto-generated method stub
		try(Scanner input = new Scanner(f)){
		int[] myList = new int[100];
		for(int i = 0; i < myList.length;i++) {
			myList[i] = input.nextInt();
			
		}
		return myList;
	}
	}
	private static void printData(int[] myList) {
		// TODO Auto-generated method stub
		
	}

}
