//10������ �ڿ��� n�� �Է¹޾� "Freeze"�� n�� ���
import java.util.*;
class hw4 {
	public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=1; i<=n ; i++)
			{if (n>10)
		{System.out.println("10 ������ �ڿ����� �Է��Ͻÿ�");return;
					}
			else if (n<=10)
		{System.out.println("Freeze");}
		}
	}
}