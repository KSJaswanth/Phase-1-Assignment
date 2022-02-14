class outer {
	
	class inner {
		public void output()
        {
            System.out.println("This is JAVA Inner Class");   
        }	
	}	
}

public class innerClass {	
	public static void main(String[] args) {

		outer.inner in = new outer().new inner();
        in.output();
	}
}