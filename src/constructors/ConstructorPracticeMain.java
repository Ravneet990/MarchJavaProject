package constructors;

public class ConstructorPracticeMain {

	public static void main(String[] args) {
		
		ConstructorPractice cp = new ConstructorPractice( 1 , "Ravneet");

		System.out.println("Employee details are: " + cp.getEmpName());
		
		ConstructorPractice cp1 = new ConstructorPractice( 2 , "Prabhjot");
		
		System.out.println("Employee details are: " + cp1.getEmpName());
		
	}

}
