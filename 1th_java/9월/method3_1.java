import java.util.*;
class method3_1 {
	Scanner sc=new Scanner(System.in);
	public void pnum() {
		int n=sc.nextInt();
		if(n>0)
			System.out.println("���");
		else if(n<0)
			System.out.println("����");
		else System.out.println("0");
	}
	public static void main(String ar[]) {
		method3_1 m31=new method3_1();
		m31.pnum();
	}
}