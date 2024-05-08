package inheritancePractice;

public class bClass extends aClass {

  public void callClasses() {
	  
	  System.out.println("in class B");
	  
  }
  
  @Override
  public void abstractMethod() {
	  
	  System.out.println("abstract method implemented");
  }
	
}
