import java.util.Arrays;
import java.util.List;

public class findString {

	public static void main(String[] args) {
		
		String[] alphabet = new String[]{"A", "B", "C"};

        // Convert String Array to List
        List<String> list = Arrays.asList(alphabet);
        
        if(list.contains("A"))
            System.out.println("The String A is Found");
            else
            	System.out.println("The String You Have Entered is not in the Array List");

	}

}
