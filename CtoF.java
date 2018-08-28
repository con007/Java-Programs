import java.io.*;
public class CtoF{
    public static void main(String ar[])throws IOException{
		FileOutputStream fos=new FileOutputStream("F.txt");
		DataInputStream dis =new DataInputStream(System.in);
		
		System.out.println("Enter 5 numbers");
		String st;
		for(int i=1;i<=5;i++){
			System.out.println("Number "+i+": ");
			st=dis.readLine();
			int num =Integer.parseInt(st);
			fos.write(num);
		}
	} 
	 
	 }