
public class userdefinedMethods {
	
	public int add() {
//here we created a method named ADD() which takes the numbers as parameter and return the added value
	      int a = 100;
	      int b = 250;
	      int solution = a+b;
	      return solution;
	   }

	public static void main(String[] args) {
		
		userdefinedMethods test = new userdefinedMethods();
		int add = test.add();
		System.out.println("The sum of a and b is: " + add);

	}

}