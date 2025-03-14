///// Print Area and Parameter of Circle
public class Ass1 {

	public static void main(String[] args) {
		
		System.out.println("Enter radius value :");
		float radi=ConsoleInput.getFloat();
		double Area=(3.14 *(radi*radi));
		double perimeter=(2 * 3.14 * (radi));
		System.out.println("Area of triangle :"+ Area);
		System.out.println("Parameter of triangle is :"+perimeter);
		
	}

}
