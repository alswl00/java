//n을 입력받아 1~n까지의 4의 배수 출력
import java.util.*;
class while_Test6 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int n=sc.nextInt();
		System.out.print("1~"+n+"까지의 4의 배수 : ");
		/*int i=1;
		while(i<=n) {
			if(i%4==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println("");*/

		int i=4;
		while(i<=n) {
			System.out.print(i+" ");
			i+=4;
		}
		System.out.println("");
	}
}