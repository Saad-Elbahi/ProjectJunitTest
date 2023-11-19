package projetJunitG5;

public class Triangle {
	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int type() {
		if (a == b || b == c) {
			return 3;
		} else if (a == b || a == c || b == c) {
			return 2;
		} else {
			return 1;
		}
	}
	
}
