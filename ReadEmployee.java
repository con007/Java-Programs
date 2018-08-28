import java.io.*;
public class ReadEmployee
{
	public static void main(String ar[]) throws IOException, ClassNotFoundException{
		FileInputStream fis=new FileInputStream("F.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee e=(Employee)ois.readObject();
		System.out.println("Name: "+e.name);
		System.out.println("Dept: "+e.dept);
		System.out.println("Basic: "+e.basic);
		System.out.println("DA: "+e.da);
	}
}