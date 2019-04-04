//1~100 중 랜덤의 수 맞추기
import java.util.*;
class random_1 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		Random r = new Random();
		int no=r.nextInt(100);

		for(int c=1;c<=10;c++) {
			int i=sc.nextInt();
			if(i<no) {
				System.out.println("숫자를 올리세요");
			}
			else if(i>no) {
				System.out.println("숫자를 낮추세요");
			}
			else if(i==no) {
				System.out.println("정답입니다!!!");
				return;
			}
		}
		System.out.println("game over");
	}
}