
class private_access_specifier
{
	private void display()
	{
		System.out.println("This is Private Access Specifier");
	}
}


public class privateAccessSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private_access_specifier obj = new private_access_specifier();
		obj.display();
		
		//Line 16 is showing error because We are accessing these private members
		//from outside the class, so there is a compile-time error.
	}

}
