package constructorPractice;

public class ConstructorChainingChild extends ConstructorChainingParent {
	
	public ConstructorChainingChild() {
		
			System.out.println("Child Constructor");
	}
	
	public void ConstructorChainingParent() {
		
		System.out.println("Parent method gets overriden in child class");
	}
	
	

}
