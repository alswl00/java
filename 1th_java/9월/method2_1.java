import java.util.*;//모든 과제 다 입력으로 수정
class method2_1 {
	Scanner sc=new Scanner(System.in);
	public void absolute() {
		int a=sc.nextInt();
		if(a<0)
			System.out.println(a+"의 절댓값>>"+(-a));
		else
			System.out.println(a+"의 절댓값>>"+a);
	}
	public static void main(String ar[]) {
		method2_1 m21=new method2_1();
		m21.absolute();
	}
}