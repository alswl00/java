//1~100 �� ������ �� ���߱�
import java.util.*;
class random_1 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		Random r = new Random();
		int no=r.nextInt(100);

		for(int c=1;c<=10;c++) {
			int i=sc.nextInt();
			if(i<no) {
				System.out.println("���ڸ� �ø�����");
			}
			else if(i>no) {
				System.out.println("���ڸ� ���߼���");
			}
			else if(i==no) {
				System.out.println("�����Դϴ�!!!");
				return;
			}
		}
		System.out.println("game over");
	}
}