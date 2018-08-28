public class Armstrong{
        public static void main(String ar[]){
		int num1=234,num2=num1,sum=0;
		while (num1>0){
		    int q=num1%10;
			int w=q*q*q;
			sum+=w;
			num1/=10;
			}
			System.out.println("armstrong");
			
			System.out.println("not armstrong");
		}
	}