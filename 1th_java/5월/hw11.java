//100~999 사이에 4의 배수가 아닌 수들의 갯수와 합
class hw11 {
	public static void main(String ar[]) {
		int count=0; int sum=0;
		for (int i=1; i<=999; i++)
		{if (i%4!=0) {
			count++;sum+=i;}
		}
	}
}