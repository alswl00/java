//10이하의 자연수 n을 입력받아 "Freeze"를 n번 출력
import java.util.*;
class hw4 {
	public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=1; i<=n ; i++)
			{if (n>10)
		{System.out.println("10 이하의 자연수를 입력하시오");return;
					}
			else if (n<=10)
		{System.out.println("Freeze");}
		}
	}
}