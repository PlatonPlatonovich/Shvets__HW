package Shapes;

public class Triangle extends Shape implements Shapable{
    private double a;
    private double b;
    private double c;
    
    public static Triangle createTriangle (double a, double b, double c){
    	if ((a+b)>c && (b+c)>a && (c+a)>b) {
    		Triangle t = new Triangle ();
    		t.setA(a);
    		t.setB(b);
    		t.setC(c);
        	return t;
    	}
    	else {
    		return null;
    	}
    }
    
    public double getA () {
    	return a;
    }
    public double getB () {
    	return b;
    }
    public double getC () {
    	return c;
    }
    
    public void setA(double a){
		this.a = a;
	}
    public void  setB(double b){
		this.b = b;
	}
    public void  setC(double c){
		this.c = c;
    }
    public double getPerimeter () {
    	double perimetr = a+b+c;
    	return perimetr;
    }
    public double getArea () {
 		double halfPerimeter =(a+b+c)/2;
    	double area = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    	return area;
    }
    public String toString () {
    	return ("Triangle:\n"+"a = "+getA()+" b = "+getB()+" c = "+getC()+" have Perimetr ="+getPerimeter()+" and Area = "+getArea());
    }
}
