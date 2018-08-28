import java.util.*;
public class MapEx{
	public static void main(String ar[]){
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(2,"Two");
		hm.put(5,"Five");
		hm.put(4,"Four");
		hm.put(1,"One");
		hm.put(3,"Three");
		System.out.println(hm);
		System.out.println("key="+hm.containsKey(3));
		System.out.println("Value="+hm.containsValue("Three"));
		hm.put(3,"Thirty");
		hm.put(6,"Thirty");
		System.out.println("key="+hm.containsKey(3));
		System.out.println("Value="+hm.containsValue("Three"));
		System.out.println(hm);
	}
}