//정수 입력받아 *찍기
import java.util.*;
class for2_Test {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		for (int a=1; a<=i; a++)
		{for (int b=1; b<=a; b++)
		{System.out.print("*");
		}	
		System.out.println(" ");
		}
	}
}