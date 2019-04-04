//이름, 나이를 입력받아 5번 출력
import java.util.*;
class do_while_Test4 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름을 입력하시오 : ");
		String name=sc.next();
		System.out.print("나이를 입력하시오 : ");
		int age=sc.nextInt();
		int i=1;
		do{
			System.out.println(name+" "+age);
			i++;
		}while(i<=5);
	}
}