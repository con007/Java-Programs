public class OverloadEx{
      void display(int a){
		 System.out.println("square="+(d*a));
		}
	  void display (int c,String b){
		  System.out.println("int="+d);
		  System.out.println("str="+c);
		}
	  void display(String e){
	       System.out.println("param="+e);
	    }
	} 
	class Main{
       public static void main(String ar[]){
	      OverloadEx.e=new OverloadEx();
		     e.display(7,"java");
		  }	
	}