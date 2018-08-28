public class Gen<T>{
	T ob;
	Gen(T m){
		ob=m;
	}
	T getOB(){
		return ob;
	}
	void getType(){
		System.out.println("Type="+ob.getClass().getName());
	}
}
class Main{
	public static void main(String ar[]){
		Gen<String> st=new Gen<String>("Abc");
		String a=st.getOB();
		System.out.println(a);
		st.getType();
		Gen<Integer> it=new Gen<Integer>(12);
		int e=it.getOB();
		System.out.println(e);
		it.getType();
	}
}