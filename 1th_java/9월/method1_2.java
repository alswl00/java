import java.util.*;
class method1_2 {
	public void num(int n){
		if(n%2==0) 
			System.out.println("¦��");
		else 
			System.out.println("Ȧ��");
	}
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		method1_2 m12=new method1_2();
		int a=sc.nextInt();
		m12.num(a);
	}
}