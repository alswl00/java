//일의자리를 1로 바꿔서 출력
import java.util.*;
class summerhw1 {
	public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		num=num-num%10+1;

		System.out.println(num);
	}
}