public class OverloadEx1{
     void display (int a){
	     System.out.println("square="+(a*a));
	    }
     void display(int a,String b){
	     System.out.println("values="+a+b);
	    }
	 void display(string c,int d){
	     System.out.println("int="+d);
		 System.out.println("str="+c);
		}
	 void display(string c){
	    System.out.println("param="+e);
		}
	 
}
class Main{
      public static void main(String ar[]){
	     OverloadEx1.e=new OverloadEx1();
		  e.display(7,"java");
		 
		 
		 }
	
	
	
	}