import java.util.*;//��� ���� �� �Է����� ����
class method2_1 {
	Scanner sc=new Scanner(System.in);
	public void absolute() {
		int a=sc.nextInt();
		if(a<0)
			System.out.println(a+"�� ����>>"+(-a));
		else
			System.out.println(a+"�� ����>>"+a);
	}
	public static void main(String ar[]) {
		method2_1 m21=new method2_1();
		m21.absolute();
	}
}