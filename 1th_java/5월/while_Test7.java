//m,n을 입력받아 n과 m사이의 홀수의 합, 짝수의 합 출력
import java.util.*;
class while_Test7 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int n=sc.nextInt();
		System.out.print("정수를 입력하시오 : ");
		int m=sc.nextInt();
		int sum1=0;int sum2=0;
		int b,s;
		
		if(n>m) {
			b=n;s=m;
		}
		else {
			b=m;s=n;
		}

		while (b>=s) {
			if(s%2==0) {
				sum1+=s;
			}
			else {
				sum2+=s;
			}
			s++;
		}
		System.out.println("홀수 합 : "+sum2);
		System.out.println("짝수 합 : "+sum1);
	}
}