//�ΰ��� ������ �Է¹޾� �� ���� ���� ���̿��� 3�� ����̰ų� 5�� ����� ������ �հ� ����� ���
import java.util.*;
class hw23 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();int b=sc.nextInt();int B,S;int count=0;int t=0;
		if(a>b) {
			B=a;S=b;
			}
		else {
			B=b;S=a;
			}
		for(int i=S;i<=B;i++) {
			if(i%3==0 || i%5==0) {
				t+=i;
				count++;
				}
			}
			System.out.println("��: "+t+" "+"���: "+t/count);
	}
}
