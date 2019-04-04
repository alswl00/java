//1~100까지 홀수, 짝수의 합
class for_Test5 {
	public static void main(String ar[]) {
		int i,sum1=0,sum2=0;
		for (i=1; i<=100; i++)
		{if (i%2==0)
		{sum1+=i;
		}
		else {sum2+=i;}
		}
		System.out.println(sum1);
		System.out.println(sum2);
		//출력할 때 다른 타입을 연결하려면 중간에 +를 써줘야함.
	}
}