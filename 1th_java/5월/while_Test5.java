//n을 입력받아 1~n까지의 합 구하기
import java.util.*;
class while_Test5 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1; i<=n;i++) {
			sum+=i;
		}
		System.out.println("1~"+n+"까지의 합 : "+sum);
	}
}

