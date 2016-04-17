package Shapes;

public class Circle extends Shape{
	private double pi = 3.14;
	private double radius;
	
	public void setRadius (double radius) {
		this.radius = radius;
	}
	public double getRadius () {
		return radius;
	}
	public Circle (double radius) {
		setRadius (radius);
	}
	public double getPerimeter () {
		double perimeter = 2*pi*radius;
		return perimeter;
	}
	public double getArea () {
		double area = pi*Math.pow(radius,2);
		return area;
	}
	public String toString () {
		return ("Circle with radius:\n"+"a = "+getRadius()+" have Perimetr ="+getPerimeter()+" and Area = "+getArea());
	}
}
