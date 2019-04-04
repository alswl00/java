//n을 입력받아 1~n 사이에 3의 배수이면서 5의 배수인수 출력
import java.util.*;
class do_while_Test2 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int n=sc.nextInt();
		int i=1;
		do {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
			i++;
		}while(i<=n);
	}
}