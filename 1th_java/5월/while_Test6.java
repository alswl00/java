//n�� �Է¹޾� 1~n������ 4�� ��� ���
import java.util.*;
class while_Test6 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int n=sc.nextInt();
		System.out.print("1~"+n+"������ 4�� ��� : ");
		/*int i=1;
		while(i<=n) {
			if(i%4==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println("");*/

		int i=4;
		while(i<=n) {
			System.out.print(i+" ");
			i+=4;
		}
		System.out.println("");
	}
}