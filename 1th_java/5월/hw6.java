//������ �Է¹޾Ƽ� 1���� �Է¹��� ���������� 5�� ����� �� ���
import java.util.*;
class hw6 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();int t=0;
		for (int a=1; a<=i; a++)
		{if (a%5==0) 
		{t+=a;
		}
		}
		System.out.println(t);
	}
}
