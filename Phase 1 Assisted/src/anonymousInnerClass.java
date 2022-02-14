
class Earth{
	public void output() {

	}
}

public class anonymousInnerClass {
	
	static Earth x = new Earth() {
		
		public void output()
        {
			System.out.println("This anonymous class");
        }
	};

	public static void main(String[] args) {
		x.output();

		};
}
