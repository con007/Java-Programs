import java.io.*;
public class CheckedEx{
     public static void main(String ar[])
	     
	    {
			 try{
				 FileInputStream f=new FileInputStream("Ab.txt");			
			    }
			 catch(FileNotFoundException fn){
				 System.out.println(fn);
			    }	 
	    }
    }