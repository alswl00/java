import java.util.*;
class method1_4{
	public String num(int n){
		if(n%2==0)
			return "¦��";
		else 
			return "Ȧ��";
	}
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		method1_4 m14=new method1_4();
		int n=sc.nextInt();
		System.out.println(m14.num(n));
	}
}