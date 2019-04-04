//"게임을 종료하시겠습니까?" 1누르면 종료, 0누르면 계속
import java.util.*;
class hw7 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("게임을 종료하시겠습니까?");
		int i=sc.nextInt();
		
		if(i==1) 
			return;
		else if(i==0)
			System.out.println("계속");
		else {System.out.println("0이나 1을 입력해주십시오");}
	}
}
