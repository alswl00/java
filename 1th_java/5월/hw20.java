//정수를 입력받아서 별 출력
import java.util.*;
class hw20 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		for (int a=i; a>=1; a--)
		{for (int b=1; b<=a; b++)
		{System.out.print("*");
		}
		System.out.println("");
		}
	}
}