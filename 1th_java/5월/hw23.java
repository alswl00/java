//두개의 정수를 입력받아 두 개의 정수 사이에서 3의 배수이거나 5의 배수인 수들의 합과 평균을 출력
import java.util.*;
class hw23 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();int b=sc.nextInt();int B,S;int count=0;int t=0;
		if(a>b) {
			B=a;S=b;
			}
		else {
			B=b;S=a;
			}
		for(int i=S;i<=B;i++) {
			if(i%3==0 || i%5==0) {
				t+=i;
				count++;
				}
			}
			System.out.println("합: "+t+" "+"평균: "+t/count);
	}
}
