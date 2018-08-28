import java.util.*;
class Abc{}
public class Generics{
	public static void main(String ar[]){
		ArrayList<String> a=new ArrayList<String>();
		a.add("Abcd");
		a.add("Ad");
		a.add(new String("ttt"));
		a.add(new String("Xyz"));
		System.out.println(a);
		//a.add(12);
		ArrayList<Abc> b=new ArrayList<Abc>();
		b.add(new Abc());
		b.add(new Abc());
		b.add(new Abc());	
		b.add("Abc");		
		
		System.out.println(b);
	}
	
}