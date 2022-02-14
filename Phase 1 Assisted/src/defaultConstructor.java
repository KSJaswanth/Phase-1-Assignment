
public class defaultConstructor {
	
	int studentid;
	String name;
	String address;

	void student_info(){
    System.out.println("Student ID: "+studentid+" Name: "+name+" Address: "+address);
	}

	public static void main(String[] args) {
  
			defaultConstructor obj1 = new defaultConstructor();  
			defaultConstructor obj2 = new defaultConstructor();  
			obj1.student_info();  
			obj2.student_info();  
//here in this default construtor program the ouptut would be 0 for integer and null for string 
//because we didn't create a constructor 
		
	}

}
