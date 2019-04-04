//정수 n입력, 구구단 n단 출력	//gugudan2
import java.util.*;
class while_Test1 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int i=1;
		System.out.println(n+"단 입니다");
		while (i<=9) {
			System.out.println(n+"*"+i+"="+n*i);
			i++;
		}
	}
}
