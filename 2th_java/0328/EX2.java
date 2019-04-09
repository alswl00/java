
public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//9.
		StringBuffer sb1=new StringBuffer("java programming ");
		StringBuffer sb2=new StringBuffer("project ");
		StringBuffer str1=null;
		StringBuffer str2=null;
		
		str1=sb1.append("project ");
		str2=sb2.append(sb1);
		System.out.println("str1="+str1);
		System.out.println("str2="+str2);
		
		//10.
		StringBuffer sb3=new StringBuffer("java programming");
		StringBuffer sb4=null;
		sb4=sb3.replace(0, 4, "JAVA");
		System.out.println("sb4="+sb4);
		
		//11.
		StringBuffer sb5=new StringBuffer("java programming");
		StringBuffer sb6=null;
		sb6=sb5.reverse();
		System.out.println("sb6="+sb6);
		
		//12.
		StringBuffer sb7=new StringBuffer("java programming");
		String str=sb7.toString();
		System.out.println(str.toUpperCase());
	}
}