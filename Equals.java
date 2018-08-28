public class Equals{
     public static void main(String ar[]){
	     String a1=new String("java");
	     String a2=new String("java");
	     String a3=new String(a2);
	     String a4="java";
	     String a5=a2;
	     String a6="java";
	     System.out.println(a1==a2);
	     System.out.println(a2==a3);
	     System.out.println(a3==a4);
		 System.out.println(a2==a5);
	     System.out.println(a4==a5);
	     System.out.println(a4==a6);
	     System.out.println(a5==a6);
	      System.out.println(a5.equals(a6));
	    }
	}