
public class A10dot4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyPoint p1 = new MyPoint();
		
//		p1.setX(0);
//		p1.setY(0);
		System.out.println("Distance between points"
		+ " (0,0) and (10,30.5) is " + Math.round(p1.distance(10, 30.5)));
	}

}


class MyPoint{
	double x;
	double y;
	
	
	public MyPoint(double x, double y) {
		super();
		this.x = x;
		this.y = y;
		
	}
	
	
//	no  argument constructor that creates point 0
	public MyPoint() {
//sets global variables  X and Y to 0 and 0 to make the point (0,0)
// now this is our point
		this.x = 0;
		this.y = 0;
	}
	
//	This is where all the variables are made, got and set. Data and data references
//	getters and setters
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	
	
// Do something with the variables
//	returns distance from point (0,0) to new point (a,b)
	
	public double distance(double a, double b){
//	formular for calculating distance between two points  square root (x2-x1)+(y2-y1)
		
		double s = (this.x - a)*(this.x -a) + (this.y - b )*(this.y - b);
		return Math.sqrt(s);
	}
	
	public double distance(MyPoint m){
//		formular for calculating distance between two points  square root (x2-x1)+(y2-y1)
			
			double s = (this.x - m.x) * (this.x -m.x) + (this.y - m.y ) * (this.y - m.y);
			return Math.sqrt(s);
		}
	
//	method that calculates distance between a new point and another point
//	 public double distance(int c, int d) {
//		 return 0;
//	 }
	
}
