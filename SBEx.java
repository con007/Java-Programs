public class SBEx{
    public static void main(String ar[]){
	     StringBuffer sb=new StringBuffer();
		 System.out.println(sb.capacity());
		 System.out.println(sb.length());
		 sb=sb.append("Abc");
		 System.out.println(sb);
		 sb=sb.append(" def");
		 System.out.println(sb);
		 sb=sb.insert(4,"Xyz");
		 System.out.println(sb);
		 sb=sb.delete(4,7);
		 System.out.println(sb);
		 sb=sb.reverse();
		 System.out.println(sb);
		}
	}