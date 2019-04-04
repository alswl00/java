//한 개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력
import java.util.*;
class hw24 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		for (int a=1; a<=10; a++)
		{System.out.println(i*a+" ");
		}
	}
}
