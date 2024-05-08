package constructorPractice;

public class Main {

	public static void main(String[] args) {
	
		NoArgConstructor pc = new NoArgConstructor();
		
		pc.myClass();
		
		OverloadingConstructor oc = new OverloadingConstructor();
		
		oc.Box();
		
		oc.Box(2, 3, 4);
		
		oc.printValues();
		
		ParameterizedConstructor pco = new ParameterizedConstructor("Ravneet");
		
		System.out.println("The name is: " + pco.name);
		
		ConstructorChainingChild ccc = new ConstructorChainingChild();
		
	    ConstructorUsingKeyword cuk = new ConstructorUsingKeyword(7);
	    
	    CopyConstructor cc = new CopyConstructor("Ravneet" , 15);
	    
	    CopyConstructor cc1 = new CopyConstructor(cc);
	    
	    cc1.studentDetails();
	    

	}

}
