import java.io.*;
public class FtoC{
	public static void main(String arp[]) throws IOException{
		FileInputStream fis=new FileInputStream("F.txt");
		int n;
		while((n=fis.read())!=-1){// minus is indicating end of file
			System.out.println("From File:"+n);
		}
	}
}