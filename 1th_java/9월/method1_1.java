import java.util.*;
class method1_1 {
	Scanner sc=new Scanner(System.in);
	public void num() {
		int a=sc.nextInt();
		if(a%2==0)
			System.out.println("¦��");
		else 
			System.out.println("Ȧ��");
	}
	public static void main(String ar[]) {
		method1_1 m11=new method1_1();
		m11.num();
	}
}