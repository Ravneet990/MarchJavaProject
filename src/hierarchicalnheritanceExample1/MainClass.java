package hierarchicalnheritanceExample1;

public class MainClass {
		  public static void main(String args[])
		  {
		    SubClass1 childObj1 = new SubClass1 ();
		    SubClass2 childObj2 = new SubClass2 ();
		    SubClass3 childObj3 = new SubClass3 ();

		    System.out.println("parentNum * childNum1 = " + childObj1.parentNum * childObj1.childNum1);	// 10 * 1 = 10
		    System.out.println("parentNum * childNum2 = " + childObj2.parentNum * childObj2.childNum2);	// 10 * 2 = 20
		    System.out.println("parentNum * childNum3 = " + childObj3.parentNum * childObj3.childNum3);	// 10 * 3 = 30
		  }
		}
		
