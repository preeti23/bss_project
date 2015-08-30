package com.bss.learning;

	class NewThread implements Runnable
	{
		   Thread t;
		   static int  threadcount=0;
		   int threadnum;

		   NewThread() {
		      // Create a new, second thread
		      t = new Thread(this, "Demo Thread");
		      System.out.println("Child thread: " + t);
		      t.start(); // Start the thread
		   }
		   // This is the entry point for the second thread.
		   public void run() {
		         for(int i = 5; i > 0; i--) 
		         {
		        	 System.out.println("Child Thread: "+t.getId()+ " - " + i);
		        	 try 
		        	 {
		        		 Thread.sleep(500);
		        	 } catch (InterruptedException e) {
		        		 	e.printStackTrace();
		        	 }
		         } 
		         System.out.println("Exiting child thread.");

		   }
		}

		public class ThreadDemo {

		   public static void main(String args[]) throws InterruptedException {
		      new NewThread(); // create a new thread
		      Thread.sleep(5);
		      new NewThread(); // create a new thread
		      try {
		         for(int i = 5; i > 0; i--) 
		         {
		           System.out.println("Main Thread: " + i);
		           Thread.sleep(500);
		         }

		      } catch (InterruptedException e) 
		      {
		         System.out.println("Main thread interrupted.");
		      }
		      System.out.println("Main thread exiting.");
		   }
		}

