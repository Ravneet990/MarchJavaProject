package divisibility;

public class Divisibilty {

	
	int[] listOfNumbers = {1,4,3,5,6,7,8,10,12,14};
	
	public void printEvenNumbers() {
		
	
	for (int i=0 ; i<10 ; i++)
		
	
	if (listOfNumbers[i]%2 ==0) {
		
		System.out.println("The even numbers are: " + listOfNumbers[i] + "and it is at index" + i);
		
	}
		
}
	
}