import java.util.Scanner;
public class A8dot6 {
	public static void main(String[] args) {
		double[][] a = getMatrix();
		double[][] b = getMatrix();
		double[][] c = multiplyMatrices(a, b);
		printMatrices(a, b, c);
}
	private static double[][] getMatrix() {
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[3][3];
		System.out.println("Enter " + matrix.length + " rows and " +
		matrix[0].length + " columns: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble(); 
				}
}
		return matrix;
		}
	private static double[][] multiplyMatrices(double[][] a, double[][] b) {
		double[][] c = new double[3][3];
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				c[row][col] = a[row][0] * b[0][col] + a[row][1] * b[1][col]
						+ a[row][2] * b[2][col]; 
				}
			}
		return c;
		}
	private static void printMatrices(double[][] a, double[][] b, double[][] c) {
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {
				System.out.printf("%7.2f", a[row][column]);
				}
			System.out.print("      ");
			for (int column = 0; column < b[row].length; column++) {
System.out.printf("%7.2f", b[row][column]);
}
			System.out.print("      ");
			for (int column = 0; column < c[row].length; column++) {
				System.out.printf("%7.2f", c[row][column]);
				}
			System.out.println();
			} 
		}
	}
