//5��
//10���� double �Է¹޾� ������
import java.util.*;
class array_Test8 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		double sum=0;
		double d[]=new double[10];

		for(int i=0;i<d.length;i++) {
			d[i]=sc.nextDouble();
			sum+=d[i];
		}
		System.out.println("��� : "+sum/d.length);
	}
}