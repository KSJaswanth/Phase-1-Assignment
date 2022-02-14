package com.Assignments;

class Customer{  
	 int amount=10000;  
	   
	 	synchronized void withdraw(int amount){  
	 	System.out.println("going to withdraw...");  
	 	  
	 		if(this.amount<amount)
	 		{  
	 		System.out.println("Less balance; waiting for deposit...");  		
	 		try{
	 			wait();
	 		   }
	 		catch(Exception e){}  
	 		}  
	 		this.amount-=amount;  
	 		System.out.println("withdraw completed...the lefft over amount is"+ this.amount);  
	 	}  
	   
	 	synchronized void deposit(int amount){  
	 		System.out.println("going to deposit...");  
	 		this.amount+=amount;  
	 		
	 		System.out.println("deposit completed... " + this.amount);  
	 		notify();  //unlocking of thread
	 	}  
	 }  
	   

public class sleepWait extends Thread
{
	 public void run(){  
		  for(int i=1;i<5;i++){  
		    try{
		    		Thread.sleep(2000);  // 2000 miliseconds = 2 secs
		    	}
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  
		    System.out.println(Thread.currentThread().getName()+ "  :"+ i);  
		  }  
		 }  


		
		 public static void main(String args[]){  
			 sleepWait t1=new  sleepWait ();  
		  t1.setName("Java");
		  t1.setPriority(MAX_PRIORITY); 
		  
		  sleepWait  t2=new  sleepWait ();  
		  t2.setName("Python");
		  
		  sleepWait  t3=new  sleepWait (); 
		  t3.setName("Oracle");
		  
		  sleepWait t4=new  sleepWait (); 
		  t4.setName("C++");
		   
		  t1.start();  
		  t2.start();  
		  t3.start();
		  t4.start();
		  
		  System.out.println(t1.getState());
		  System.out.println(t3.getState());
		  System.out.println(t2.getState());
		  
		   
		  final Customer c=new Customer();  	
			 		
			 		new Thread(){                 // anonymous class
			 		  public void run()
			 		  {
			 			c.withdraw(5000);
			 		  }  
			 		}.start(); 
			 		new Thread(){                 // anonymous class
			 			  public void run()
			 			  {
			 				c.withdraw(4000);
			 			  }  
			 			}.start(); 
			 		new Thread(){                 // anonymous class
			 				  public void run()
			 				  {
			 					c.withdraw(10000);
			 				  }  
			 				}.start(); 
			 		
			 		new Thread(){  
			 		  public void run()
			 		   {
			 			 c.deposit(20000);
			 		   }  
			 		}.start();    
			 	}
			 
		 }  
