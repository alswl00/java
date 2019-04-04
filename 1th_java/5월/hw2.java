//임의의 점수 입력받아 60점 이상이면 합격, 아니면 불합격 출력
import java.util.*;
class hw2 {
	public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
	int score=sc.nextInt();
	if(score>=60) {
		System.out.println("합격"); }
	else {System.out.println("불합격");
	}
	}
}