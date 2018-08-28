import java.io.*;
public class FtoF{
	public static void main(String arp[]) throws IOException{
		FileInputStream fis=new FileInputStream("MyApplet.java");
		DataInputStream dis=new DataInputStream(fis);
		FileOutputStream fos=new FileOutputStream("F2.java");
		DataOutputStream dos=new DataOutputStream(fos);
		String st;
		while((st=dis.readLine())!=null){
			dos.writeBytes(st);
			dos.writeBytes("\n");
		}
	}
}