
public class Circle {

	double radius;

//	 no argument constructor

	public Circle() {
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
//getter
	public double getRadius() {
		return radius;
	}
//setter
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	public String toString() {
		return "Circle{" + "radius" + radius + '}';
	}
	
}
