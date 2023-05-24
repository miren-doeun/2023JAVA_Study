
public class Circle {
	private double radius;
	public static double PI=3.14;
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double computerArea() {
		return 2*PI*radius;
	}
	public double computerPerimeter() {
		return 2*PI*radius;
	}
}
