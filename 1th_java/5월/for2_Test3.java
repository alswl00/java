//정수 n입력받아, n줄 출력
import java.util.*;
class for2_Test3 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//int c=3;
		for (int a=1; a<=n; a++) {
			/*c-=3;
			for (int b=1; b<=4; b++) {
				System.out.print(c+=1);
			}*/
			for(int b=a;b<=a+3;b++) {
				System.out.print(b);
			}
			System.out.println("");
		}
	}
}