package com.Assignments;

public class threadCreation extends Thread
{
 	public void run()
 	{
  		System.out.println("This is the program for Threads Creation");
}


public static void main( String args[] )
 	{
  		threadCreation mt = new  threadCreation();
  		mt.start();
 	}
}
