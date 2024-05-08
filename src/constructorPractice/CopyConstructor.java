package constructorPractice;

// The Student class has two instance variables, name and age, to represent the name and age of a student.
//It includes a constructor Student(String n,int a)that initializes the name and age of a Student object with the provided values.
//There'sanother constructor Student(Student other)which is a copy constructor.It takes another Student object other as input and copies its name and age to the new Student object being created.
//The method studentDetails()prints out the name and age of a Student object.
//The main method is the entry point of the program.
//Inside main,it creates a Student object student1 with name"Tiya"and age 23 using the first constructor.
//Then it creates another Student object student2 using the copy constructor,passing student1 as an argument.It then calls studentDetails()on student2 to print out its details.

public class CopyConstructor {

	String name;

	int age;

	public CopyConstructor(String n, int a) {

		name = n;

		age = a;

	}
	
	public CopyConstructor(CopyConstructor other) {
		
		this.name = other.name;
		
		age = other.age;
	}
	
	public void studentDetails() {
		
		System.out.println("Name : " + name);
		
		System.out.println("Age" + age);
		
		
	}

}
