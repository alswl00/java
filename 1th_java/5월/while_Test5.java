//n�� �Է¹޾� 1~n������ �� ���ϱ�
import java.util.*;
class while_Test5 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1; i<=n;i++) {
			sum+=i;
		}
		System.out.println("1~"+n+"������ �� : "+sum);
	}
}

