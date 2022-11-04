

//public class ComparableCircle {
//
//}
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
	public ComparableCircle(double radius) {
		super(radius);
	}

	@Override
	public int compareTo(ComparableCircle circle) {
//TODO Auto-generated method stub
		if (getArea() > circle.getArea())
			return 1;
		else if (getArea() < circle.getArea())
			return -1;
		else
			return 0;
	}

}