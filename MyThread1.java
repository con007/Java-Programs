public class MyThread1 implements Runnable {
     public void run(){
	      Thread t=Thread.currentThread();
	      String a=t.getName();
	      int pr=t.getPriority();
	      ThreadGroup tg=t.getThreadGroup();
	      System.out.println("Name: "+a);
	      System.out.println("Priority: "+pr+"  "+a);
	       System.out.println("Group: "+tg+"  "+a);
	    }
	 
	}
	class Main{
		  public static void main(String ar[]){
			  MyThread1 m=new MyThread1();
			  Thread t1=new Thread(m);
			  Thread t2=new Thread(m,"Two");
			  Thread t3=new Thread(m,"thred");
			  t1.setName("One");
			  t2.setPriority(10);
			  t1.start();//pushes the thread into runnable state
			  t2.start();
			  t3.start();
		    }  
		}
