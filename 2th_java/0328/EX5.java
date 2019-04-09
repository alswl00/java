import java.util.*;
public class EX5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		int ran=(int)(Math.random()*100);
		for(int i=0;i<5;i++) {
			System.out.print("숫자를 입력하시오(0~99)>>");
			num=sc.nextInt();
			if(ran>num) System.out.print("너무 작습니다.");
			else if(ran<num) System.out.print("너무 큽니다.");
			else {
				System.out.println("****축하합니다.****");
				break;
			}
			System.out.println("("+(i+1)+"회)");
			if(i==4) {
				System.out.print("실패하셨습니다.");
				System.out.println("정답은 "+ran+"입니다.");
			}
		}
	}

}
