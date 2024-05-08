package constructorPractice;

public class OverloadingConstructor {
	
	double width, height, depth;
	
	// non parameterized constructor
	public void Box() {
		
		width =1;
		height=1;
		depth=1;
		}
	// parameterized constructor
	public void Box(double w, double h, double d) {
		
		width = w;
		
		height = h; //how to know height will come LHS or h will come LHS?
		depth = d;		
		
	}
	
	public void printValues() {
		
		System.out.println("Width" + width);
		System.out.println("Height" +height);
		System.out.println("Depth" + depth);
	}
}
