public class Primeno {
     public static void main (String ar[]){
	    int num=29,c=0;
		for (int a=2;a<=num/2;a++){
			
		    if (num% a ==0){
		     c++;
		     break;
		    }
	    }
	if(c==0)
	
	     System.out.println("Prime");
	     else
	      System.out.println("not prime");
	 }
}
	
	
	