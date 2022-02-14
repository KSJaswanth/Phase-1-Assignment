package com.Assignments;

interface Drawable{  
	int salary = 100;
	void draw();  //by default abstarct method() // public abstract void draw();		
	void Shape1();
	void show();
}  

interface Shape1{
	int salary = 200;
	void shape();  //by default abstarct method()  // public abstract void shape();	
	void show();
}

interface Demo extends Shape1{	
}
	
	public class Interfaces implements Shape1, Drawable{
		
		int salary = 900;
		
		public void show(){
			System.out.println("inside show()");
		}

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("inside draw");
		}

		@Override
		public void Shape1() {
			// TODO Auto-generated method stub
			System.out.println("inside shape");	
		}
		
		public static void main(String args[]){
			Interfaces obj = new Interfaces();
			obj.Shape1();
			obj.show();
			obj.draw();
			
			Shape1 d = new Interfaces();
			System.out.println(d.salary);
			
			System.out.println("salary  "+ obj.salary);		
		}
	}

