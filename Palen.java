public class Palen{
     public static void main(String ar[]){
	 int num1=1232,num2=num1,sum=0;
	    while(num1>0){
		    int a=num1%10;
		        sum=(sum*10)+a;
			    num1/=10;
	    }
		System.out.println("number="+ num2);
		System.out.println("result="+sum);
	}
}