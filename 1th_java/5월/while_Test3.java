//정수 n입력받아 1~n까지의 짝수의 합, 홀수의 합 출력
import java.util.*;
class while_Test3 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int sum1=0;int sum2=0;
		while(i<=n) {
			if(i%2==0) {
				sum1+=i;
			}
			else {
				sum2+=i;
			}
			i++;
		}
		System.out.println("1부터 n까지 짝수의 합="+sum1);
		System.out.println("1부터 n까지 홀수의 합="+sum2);
	}
}
