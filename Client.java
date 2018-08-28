import java.io.*;
import java.net.*;
public class Client{
	public static void main(String ar[])
	throws IOException,UnknownHostException
	{
		Socket s=new Socket("localhost",2000);
		DataInputStream dis1=new DataInputStream(System.in);
		DataInputStream dis2=new DataInputStream(s.getInputStream());
		PrintStream ps=new PrintStream(s.getOutputStream());
		String st;
		while(true){
			System.out.println("enter a String:");
			st=dis1.readLine();
			ps.println(st);//request to server
			st=dis2.readLine();
			System.out.println("From Server:+st");
			
		}
	}
}