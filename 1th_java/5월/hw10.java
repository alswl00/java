//1~100 사이에 7의 배수의 갯수와 합
class hw10 {
	public static void main(String ar[]) {
		int count=0;int sum=0;
		for (int i=100; i<=999; i++)
		{if (i%7==0)
		{sum+=i;count++;
		}
		}
	}
}