//2��
//10���� ������ �Է¹޾� �����ϰ� 3�� ����� ���
import java.util.*;
class array_Test5 {
	public static void main(String ar[]) {
		int i[]=new int [10];
		Scanner sc=new Scanner(System.in);
		
		for(int j=0;j<i.length;j++) {
			i[j]=sc.nextInt();
		}
		for(int j=0;j<i.length;j++) {
		if(i[j]%3==0) {
				System.out.print(i[j]+" ");
		}
		}
	}
}
