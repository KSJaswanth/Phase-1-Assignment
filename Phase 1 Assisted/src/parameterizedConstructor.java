
public class parameterizedConstructor {

	int studentid;
	String name;
	String address;
	
	parameterizedConstructor(int id, String name, String address){  
	       this.studentid = id;  
	       this.name = name;
	       this.address = address;
	}
	void student_info(){
	    System.out.println("Student ID: "+studentid+" Name: "+name+" Address: "+address);
		}
	
	public static void main(String[] args) {

		parameterizedConstructor obj1 = new parameterizedConstructor(2022001, "Andrew", "London");  
		parameterizedConstructor obj2 = new parameterizedConstructor(2022002, "Tody", "Paris");  
		obj1.student_info();  
		obj2.student_info(); 
		
	}

}
