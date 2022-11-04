
public class A6dot26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[]myList = new double[3];
		for(int i =0; i<myList.length; i++) {
			
		}
		
		double max = myList[0];
		
		for (int count = 0, number = 3; count < 100; number +=2) {
			if(isPal(number) && isPrime(number)) {
				System.out.println(number);
				count++;
			}
		}

	}

	private static boolean isPrime(int number) {
		// TODO Auto-generated method stub
		
		for(int i = 2; i < number; i++) {
			if (number % 1 == 0) {
				return false;
			}
		}
		return false;
	}

	private static boolean isPal(int number) {
		// TODO Auto-generated method stub
		return false;
	}
	
	


}
