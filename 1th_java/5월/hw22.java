//10개의 정수를 입력받아 입력받은 수들 중 짝수의 갯수와 홀수의 갯수를 각각 구하여 출력
import java.util.*;
class hw22 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int count1=0; int count2=0;
		for (int a=1; a<=10; a++)
		{int i=sc.nextInt();
		if (i%2==0){
			count2++;
		}
		else {
			count1++;
		}
		}
		System.out.println("홀수: "+count1+"개"+" "+"짝수: "+count2+"개");
	}
}
