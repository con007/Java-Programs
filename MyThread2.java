public class MyThread2 extends Thread{
     public void run()
	 {
		  //try{ 
		 
	          for(int i=1;i<=5;i++){
		          Thread t=Thread.currentThread();
		          String r=t.getName();
		          System.out.println(r+" "+i);
			    //  Thread.sleep(1000);
			    }
		   // }
           // catch(InterruptedException ie){
				
			//}			
	    }
    }
	class Main{
		  public static void main(String ar[]) throws
		  InterruptedException
		  {
			  MyThread2 m=new MyThread2();
			  Thread t1=new Thread(m);
			  Thread t2=new Thread(m,"Two");
			  Thread t3=new Thread(m,"three");
			  t1.setName("One");
			  //t2.setPriority(10);
			  t1.start();
			  t1.join();
			  t2.start();
			  t2.join();
			  t3.start();
		    }  
		}
