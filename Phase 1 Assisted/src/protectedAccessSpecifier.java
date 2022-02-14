
class protected_access_specifier
{
	protected void display()
	{
		System.out.println("This is Public Access Specifier");
	}
}

public class protectedAccessSpecifier {

	public static void main(String[] args) {
		
		protected_access_specifier obj = new protected_access_specifier();
		obj.display();

	}

}
