//10���� ������ �Է¹޾� �Է¹��� ���� �� ¦���� ������ Ȧ���� ������ ���� ���Ͽ� ���
import java.util.*;
class hw22 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int count1=0; int count2=0;
		for (int a=1; a<=10; a++)
		{int i=sc.nextInt();
		if (i%2==0){
			count2++;
		}
		else {
			count1++;
		}
		}
		System.out.println("Ȧ��: "+count1+"��"+" "+"¦��: "+count2+"��");
	}
}
