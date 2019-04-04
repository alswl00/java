//정수를 입력받아서 1부터 입력받은 정수까지의 5의 배수의 합 출력
import java.util.*;
class hw6 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();int t=0;
		for (int a=1; a<=i; a++)
		{if (a%5==0) 
		{t+=a;
		}
		}
		System.out.println(t);
	}
}
