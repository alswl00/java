//1. 정수 5개 입력받아서 짝수, 홀수별 합계 출력
import java.util.*;
class array_Test14 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int i[]=new int [5];
		int sum1=0, sum2=0;
		for(int n=0;n<i.length;n++) {
			i[n]=sc.nextInt();
			if(i[n]%2!=0)
				sum1+=i[n];
			else 
				sum2+=i[n];
		}
		System.out.println("홀수의 합 : "+sum1+"	짝수의 합 : "+sum2);
	}
}