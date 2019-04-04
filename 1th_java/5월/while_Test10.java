//"Bees" 입력받아 5번 출력
import java.util.*;
class while_Test10 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("입력하시오 : ");
		String s=sc.next();
		int i=1;
		while(i<=5) {
			if(s.equals("Bees")) {
				System.out.println("Bees");
			}
			i++;
		}
	}
}