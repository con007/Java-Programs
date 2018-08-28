public class FMethod{

       void show(){
	       System.out.println("instance method");
		 }
		 private FMethod(){}
		 static FMethod get(){
		     return new FMethod();
			 }
}
class Main{
    public static void main(String ar[]){
	     //FMethod f=new FMethod();
		 FMethod f=FMethod.get();
		 
		 f.show();
		}
	}