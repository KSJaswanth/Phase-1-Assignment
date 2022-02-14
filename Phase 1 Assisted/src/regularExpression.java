import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("Earth");
	    Matcher matcher = pattern.matcher("Earth is the 3rd planet from the Sun");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("A Match Has Been Found");
	    } else {
	      System.out.println("No Match Found");
	    }
		
	}

}
