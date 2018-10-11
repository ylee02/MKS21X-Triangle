public class Triangle {
	private Point v1,v2,v3;
	public Triangle (Point p1, Point p2, Point p3) {
		v1 = new Point(p1);
		v2 = new Point(p2);
		v3 = new Point(p3);
	}
	public Triangle (double d1, double d2, double d3, double d4, double d5, double d6) {
		v1 = new Point(d1, d2);
		v2 = new Point(d3, d4);
		v3 = new Point(d5, d6);
	}
	public static double findDistance(Point p1, Point p2) {
		return Math.sqrt(Math.pow((p1.getX() - p2.getX()), 2) + Math.pow((p1.getY() - p2.getY()), 2));
	}

	
	public double getPerimeter() {
		return findDistance(v1, v2) + findDistance(v2, v3) + findDistance(v3, v1);
	}

	public Point getVertex(int i) {
		if (i == 0) {
			return new Point(v1);
		}
		if (i == 1) {
			return new Point(v2);
		}
		if (i == 2) {
			return new Point(v3);
		}
		return v1;
	}
		
	public void setVertex(int i, Point p) {
		if (i == 0) {
			v1 = new Point(p);
		}
		if (i == 1) {
			v2 = new Point(p);
		}
		if (i == 2) {
			v3 = new Point(p);
		}
	}

	public String toString() {
		return "Triangle: A(" + v1.getX() + ", " + v1.getY() + ") (" + v2.getX() + ", " + v2.getY() + ") (" + v3.getX() + ", " + v3.getY() + ')';
	}
}
