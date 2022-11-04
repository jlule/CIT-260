
public class A13dot6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparableCircle circle1 = new ComparableCircle(5);
		ComparableCircle circle2 = new ComparableCircle(10);

//display the circles
		System.out.println(circle1.toString() + "area = " + circle1.getArea());
		System.out.println(circle2.toString() + "area = " + circle2.getArea());

		// display the max circle
		ComparableCircle circle3 = max(circle1, circle2);
		System.out.println(circle3.toString() + "area = " + circle3.getArea());

	}

//	return the maximum of two circles objects
	public static ComparableCircle max(ComparableCircle c1, ComparableCircle c2) {

		if (c1.compareTo(c2) > 0) {
			return c1;
		} else {
			return c2;
		}

	}
}
