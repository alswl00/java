//100������ �ڿ��� n�� �Է¹ް� n���� ������ �Է¹޾� ����� ���
import java.util.*;
class hw21 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int t=0;
		if (n>100)
		{System.out.println("100������ ������ �Է��Ͻÿ�");
		}
		else {for (int i=1; i<=n; i++)
		{int a=sc.nextInt();
		t+=a;
		}
		System.out.println(t/n);
		}
	}
}
