import java.io.File;
public class FileEx{
     public static void main(String ar[]){
		 // File f=new File("C:/Users");	 
	  // boolean b=f.exists();
	  // System.out.println(b);
	  // b=f.isFile();
	  // System.out.println(b);
	  // b=f.isDirectory();
	  // System.out.println(b);
	  // System.out.println("Parent:"+f.getParent());
	  // System.out.println("Absolute Path:"+f.getAbsolutePath());
	  // System.out.println("Name:"+f.getName());
	  // System.out.println("Size in Bytes:"+f.length());
	  File ff=new File("C:/Windows");
	  if(ff.isDirectory()){
		  File d[]=ff.listFiles();
		  for(File sa:d){
			  System.out.println("Name:"+sa.getName());
			  System.out.println("Size:"+sa.length());
		  }
	  }
	 }
	
}