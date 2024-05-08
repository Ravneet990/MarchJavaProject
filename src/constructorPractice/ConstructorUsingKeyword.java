package constructorPractice;

public class ConstructorUsingKeyword {
	
	int length, width;
	
	public  ConstructorUsingKeyword(int side) {
		
		this.ConstructorUsingKeyword(side, side);
	}

	
	public void ConstructorUsingKeyword (int l, int w) {
		
		length =l;
		
		width = w;
		
		System.out.println("Length" + length);
		
		System.out.println("Length" + width);
	}
}
