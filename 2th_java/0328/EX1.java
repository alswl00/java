
public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.
		String strData1="I LOVE MIRIM MEISTER";
		int len=strData1.length();
		System.out.println("문자열의 개수 : "+len);
		
		//2.
		String str="I LOVE MIRIM MEISTER";
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		//3.
		String R1="JAVA";
		String R2="JAVA";
		String R3="java";
		System.out.println("R1==R2 --> "+(R1==R2));
		System.out.println("R1.equals(R2) --> "+R1.equals(R2));
		System.out.println("R1==R3 --> "+(R1==R3));
		System.out.println("R1.equals(R3) --> "+R1.equals(R3));
		
		//4.
		char ch='A';
		String str1="A"; String str2;
		str2=String.valueOf(ch);
		if(str1.equals(str2)) 
			System.out.println("같음");
		else System.out.println("다름");
		
		//5.
		String str3=" I LOVE MIRIM MEISTER ";
		String str4=str.trim();
		if(str3.equals(str4)) System.out.println("같음");
		else System.out.println("다름");
		
		//6.
		String str5="I LOVE MIRIM MEISTER";
		String str6=str5.substring(7,12);
		System.out.println(str6);
		
		//7.
		String str7="I LOVE MIRIM MEISTER";
		String str8=str7.substring(2,5);
		System.out.println(str8);
	}
}