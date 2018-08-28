 abstract public class AbsEx{
     abstract void m1();
	 abstract void m2();
      void m3() {
	      System.out.println("mehtod 3");
		}
		abstract void m4();
		
	}
	abstract class Abs2 extends AbsEx{
	     void m1(){
		      System.out.println("method1");
			  }
			  void m2(){
			      System.out.println("method2");
				}
	    }
		class Main {
		     public static void main(String ar[]){
			     Abs2 a=new Abs3();
				 a.m1();
				 a.m2();
				 a.m3();
				 a.m4();
				}
			}
			class Abs3 extends Abs2{
				void m4(){
					System.out.println("method 4");
				}
			}