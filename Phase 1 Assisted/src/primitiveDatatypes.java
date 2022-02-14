
public class primitiveDatatypes {

	public static void main(String[] args) {
		
System.out.println("Implicit Type Casting");

		char a='B';
		System.out.println("Value of a is "+a);
		
		int b=a;
		System.out.println("Value of b is "+b);
		
		float c=a;
		System.out.println("Value of c is "+c);
		
		long d=a;
		System.out.println("Value of d is "+d);
		
		double e=a;
		System.out.println("Value of e is "+e);
		
		System.out.println("\n");
		System.out.println("Explicit Type Casting");
		
		float x=50.5f;
		int y=(int)x;
		
		System.out.println("Value of x is "+x);
		System.out.println("Value of y is "+y);


	}

}