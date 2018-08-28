import java.io.*;
public class CharStr{
	public static void main(String ar[])throws IOException{
		FileReader fr=new FileReader("MyApplet.java");
		FileWriter fw=new FileWriter("F3.java");
		int num;
		while((num=fr.read())!=-1){
			fw.write(num);
		}
		fw.close();
	}
}