//1. ���� 5�� �Է¹޾Ƽ� ¦��, Ȧ���� �հ� ���
import java.util.*;
class array_Test14 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int i[]=new int [5];
		int sum1=0, sum2=0;
		for(int n=0;n<i.length;n++) {
			i[n]=sc.nextInt();
			if(i[n]%2!=0)
				sum1+=i[n];
			else 
				sum2+=i[n];
		}
		System.out.println("Ȧ���� �� : "+sum1+"	¦���� �� : "+sum2);
	}
}