import java.util.*;
class method3_4 {
	public String absolute(int n) {
		if(n>0) 
			return "���";
		else if(n<0)
			return "����";
		else return "0";
	}
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		method3_4 m34=new method3_4();
		int n=sc.nextInt();
		System.out.println(m34.absolute(n));
	}
}