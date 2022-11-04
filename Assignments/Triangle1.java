public class Triangle1 extends GeometricObject {

	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;

	public Triangle1() {
		side1 = 0.0;
		side2 = 0.0;
		side3 = 0.0;
	}

	public Triangle1(double a, double b, double c) {
		side1 = a;
		side2 = b;
		side3 = c;
	}

	public void show() {
		System.out.println(side1 + "," + side2 + "," + side3 + ",");
	}

	public double getArea() {
		double area=0;
		 area = (side1 * side2 * side3);
		  return (0.5 *  area);
	}

	public double getPerimeter() {
		return (side1 + side2 + side3);
	}

	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;

	}
}

