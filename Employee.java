import java.io.*;
public class Employee implements Serializable{
	String name, dept;
	double basic;
	transient double da;
	void set(String name, String dept, double basic, double da) {
		this.name=name;
		this.dept=dept;
		this.basic=basic;
		this.da=da;
	}
}

class Main {
	public static void main(String ar[]) throws IOException {
		FileOutputStream fos=new FileOutputStream("F.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Employee e=new Employee();
		e.set("Ravi","Sales",20000,10000);
		oos.writeObject(e);
		oos.close();
		fos.close();
	}
}