//m,n�� �Է¹޾� n�� m������ Ȧ���� ��, ¦���� �� ���
import java.util.*;
class while_Test7 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int n=sc.nextInt();
		System.out.print("������ �Է��Ͻÿ� : ");
		int m=sc.nextInt();
		int sum1=0;int sum2=0;
		int b,s;
		
		if(n>m) {
			b=n;s=m;
		}
		else {
			b=m;s=n;
		}

		while (b>=s) {
			if(s%2==0) {
				sum1+=s;
			}
			else {
				sum2+=s;
			}
			s++;
		}
		System.out.println("Ȧ�� �� : "+sum2);
		System.out.println("¦�� �� : "+sum1);
	}
}