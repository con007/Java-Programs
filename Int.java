public interface Int{
     int a=20;
	 void m1();
}
class Ab implements Int {
      public void m1(){
	      System.out.println("m-1,a="+(a+a));
	    }
} 
class Main{
    public static void main(String ar[]){
	     Ab a=new Ab();
		 a.m1();
		 Abc b=new Abc();
		 b.m2();
		 b.m3();
		 b.m4();
		}
	}  
interface I2{
	 void m2();
}
interface I3{
	  void m3();
}
interface I4 extends I2,I3{
	     void m4();
}
class Abc extends Ab implements Int, I4{
	public void m4(){
		System.out.println("m-4");
	}
	public void m2(){
		 System.out.println("m-2");
	}
	public void m3(){
		 System.out.println("m-3");
	}
}