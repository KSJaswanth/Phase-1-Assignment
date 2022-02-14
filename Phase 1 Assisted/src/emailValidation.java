import java.util.*;

public class emailValidation {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
        ar.add("abc@gmail.com");
        ar.add("def@gmail.com");
        ar.add("ghi@gmail.com");
        ar.add("jkl@gmail.com");
        ar.add("mno@gmail.com");
        ar.add("pqr@gmail.com");
System.out.println("Enter the mail you need to search:");
Scanner scan=new Scanner(System.in);
String st=scan.nextLine();
for(String lst: ar)
{
if(st.contains(lst))
{
System.out.println("Entered email ID is here! "+st);
break;
}
else
{
System.out.println("Entered email id is not in the list");
break;
}
}
}
}