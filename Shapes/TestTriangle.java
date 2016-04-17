package Shapes;

public class TestTriangle {

	public static void main (String[]args) {
		Shape [] shapes = new Shape [5];
		shapes [0] = Triangle.createTriangle (3,4,5);
		shapes [1] = Triangle.createTriangle (16,12,11);
		shapes [2] = new Rectangle (10.1,15.1);
		shapes [3] = new Circle (22.1);
		shapes [4] = Triangle.createTriangle (1,6,19);
			
		for(Shape e:shapes){
			try {
				System.out.println(e.toString());
			}
			catch (Exception x){
			}
		}
		}
}
