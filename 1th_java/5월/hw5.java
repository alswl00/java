//100 ������ �� ���� ������ �Է¹޾� ���������� ū������ ���ʴ�� ���
import java.util.*;
class hw5 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();int b=sc.nextInt();
		if (a+b>200)
		{System.out.println("100������ �ڿ����� �Է��Ͻʽÿ�");
		}
		else if(a>b){for (int i=b; b<=a; b++)
			{System.out.println(b);
		}
		}
		else {for (int i=a; a<=b; a++)
		{System.out.println(a);
		}
		}
	}
}
