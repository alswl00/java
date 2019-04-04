//100이하의 자연수 n을 입력받고 n개의 정수를 입력받아 평균을 출력
import java.util.*;
class hw21 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int t=0;
		if (n>100)
		{System.out.println("100이하의 정수를 입력하시오");
		}
		else {for (int i=1; i<=n; i++)
		{int a=sc.nextInt();
		t+=a;
		}
		System.out.println(t/n);
		}
	}
}
