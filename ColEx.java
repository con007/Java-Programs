import java.util.*;
class Abc{}
class Xyz{}
public class ColEx {
	public static void main(String ar[]){
		ArrayList r=new ArrayList();
		System.out.println(r);
		Abc a=new Abc();
		Abc aa=new Abc();
		Xyz b=new Xyz();
		String c=new String("java");
		int d=200;
		r.add(a);
		r.add(b);
		r.add(c);
		r.add(d);
		System.out.println(r);
		Abc z=(Abc)r.get(0);
		
		r.remove(b);
		System.out.println(r);
		System.out.println(r.isEmpty());
		//r.clear();
		//System.out.println(r.isEmpty());
		ArrayList g=new ArrayList();
		g.add("Two 1");
		g.add("Two 2");
		g.add("Two 3");
		System.out.println(r);
		r.addAll(g);
		System.out.println(r);
		//r.removeAll(g);
		//System.out.println(r);
		Iterator i=r.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		System.out.println("***********");
		Object ct[]=r.toArray();
		for(Object df:ct){
			System.out.println(df);
		}
		System.out.println("index of Abc class :"+r.indexOf(a));
		System.out.println("index of another Abc class :"+r.indexOf(aa));
		
		
		
		
		}


}