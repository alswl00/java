//2���� ������ �Է¹޾� �� ���� ������ 5�� ����� ���� ���
import java.util.*;
class while_Test4 {
	public static void main(String ar[]) {
		 Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n2=sc.nextInt();
		int count=0;int Big,Small;
		if(n>n2) {
			 Big=n;Small=n2;}
	    else if(n==n2) {Big=n;Small=n2;}
		else {Big=n2;Small=n;}
		while(Small<=Big) {
			if (Small%5==0) {
				count++;
			}
			Small++;
		}
		System.out.println("5�� ����� ������ ���� = "+count+"��");
	}
}