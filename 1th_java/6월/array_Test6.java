//3��
//5���� �Է¹޾Ƽ� �ִ� ���
import java.util.*;
class array_Test6 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int i[]=new int [5]; int b=0;
		
		for(int j=0;j<i.length;j++) {
			i[j]=sc.nextInt();
			if(i[j]>b) {
				b=i[j];
			}
		}
		System.out.println("�ִ� : "+b);
	}
}