package Shapes;

public class Rectangle extends Shape{
    private double a;
    private double b;
    

    public double getA () {
    	return a;
    }
    public double getB () {
    	return b;
    }
    
    public void setA(double a){
		this.a = a;
	}
    public void  setB(double b){
		this.b = b;
	}
    public Rectangle (double a, double b) {
    	setA (a);
    	setB (b);
    }
    
    public double getPerimeter () {
    	double perimetr = a+b;
    	return perimetr;
    }
    public double getArea () {
     	double area = a*b;
    	return area;
    }
    public String toString () {
    	return ("Rectangle:\n"+"a = "+getA()+" b = "+getB()+" have Perimetr ="+getPerimeter()+" and Area = "+getArea());
    }
}
