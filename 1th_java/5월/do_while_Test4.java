//�̸�, ���̸� �Է¹޾� 5�� ���
import java.util.*;
class do_while_Test4 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		String name=sc.next();
		System.out.print("���̸� �Է��Ͻÿ� : ");
		int age=sc.nextInt();
		int i=1;
		do{
			System.out.println(name+" "+age);
			i++;
		}while(i<=5);
	}
}