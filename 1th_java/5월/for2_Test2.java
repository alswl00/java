//정수 n입력받아, n줄의 숫자탑 찍기
import java.util.*;
class for2_Test2 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int a=1; a<=n; a++) {
			int c=0;
			for (int b=1; b<=a; b++) {
				System.out.print(c+=1);
			}
			System.out.println("");
		}
	}
}
