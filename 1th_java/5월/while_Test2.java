//정수 n 입력받고, 1부터 n까지 짝수의 합 출력
import java.util.*;
class while_Test2 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); int i=1; int sum=0;
		while(i<=n) {
			if(i%2==0) 
				sum+=i;
		i++;
		}
		System.out.println(sum);
	}
}