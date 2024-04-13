package loopsInJava;

public class ForLoopExample {

	int a= 5;
	
	String nameOfStudent = "Ravneet";
	
	String[] listOfStudents = {"Prabh" , "Manvir" , "Arsh" , "Ravneet" , "Jerin"};
	
	int[] ageOfStudents = {10 , 11, 12 , 13 , 14 };
	
	public void printStudentsName() {
		
		System.out.println("Name of Student:" + nameOfStudent);
		
	}
	
	public void printListOfStudents() {
		
		System.out.println("Name of Students are:" + listOfStudents[3]);
	}
	
	public void incrementValue() {
		
		System.out.println("Value of a originally is:" +a);
		
		a++;
		
		System.out.println("Value of post increment is:" + a);
		
		a--;
		
		System.out.println("Value of Post decrement is:" + a);
		
		++a;
		
		System.out.println("Value of Pre Increment is :" + a);
		
		--a;
		
		System.out.println("Value of Pre decrement is :" +a);
	}
	
	public void findRavneet() {
		
		for(int i=0; i<5; i++) {
			
			
		}
	}
		

public void printAge() {
	
	for(int j=0 ; j<5 ; j++) {
		
		System.out.println(ageOfStudents[j]);
		
	}
	
}
		
		
	}

