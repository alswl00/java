//4��
//5�� �Է¹޾Ƽ� �ִ� �ּڰ� ���ϱ�
import java.util.*;
class array_Test7 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int i[]=new int[5]; int max=0,min=0;

		for(int j=0;j<i.length;j++) {
			i[j]=sc.nextInt();
			if(j==0) {
				min=i[j];
			}
			if(i[j]>max) {
				max=i[j];
			}
			else if(i[j]<min) {
				min=i[j];
			}
		}
		System.out.println("�ִ� : "+max+"	 �ּڰ� : "+min);
	}
}