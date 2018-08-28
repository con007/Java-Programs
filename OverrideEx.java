public class OverrideEx{
     void calc2(int a,int b){
	     System.out.println("total="+(a+b));
	  
	    }
	  void display(int a){
	      System.out.println("number="+a);
		}
	}
	class Over3 extends OverrideEx{
	   void display(String b){
	       System.out.println("str="+b);
		  // super.calc(4,6);
		   }
		   void calc(int x,int y){
		        System.out.println("product="+(x*y));
				}
	   }
	   class Main{
	       public static void main(String ar[]){
		        //Over3 e=new Over3();
				//e.display("java");
				//e.display(3);
				//e.calc(4,5);
				//e.calc(4,5);
				OverrideEx f=new Over3();
				f.calc(9,9);
			}
		}
	