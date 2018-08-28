public class ObjEx{
    void method1(){
	   System.out.println("1st method");
	}
	void method2(){
	   System.out.println("2nd method");
	}
}
class Main{
    public static void main(String ar[]){
	    ObjEx e=new ObjEx();
		   e.method2();
		   e.method1();
    }
}