//n�� �Է¹޾� 1~n ���̿� 3�� ����̸鼭 5�� ����μ� ���
import java.util.*;
class do_while_Test2 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int n=sc.nextInt();
		int i=1;
		do {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
			i++;
		}while(i<=n);
	}
}