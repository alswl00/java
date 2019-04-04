//a+b=14를 만족하는 한 자리 자연수 a,b를 모두 출력
class hw18 {
	public static void main(String ar[]) {
		for (int a=1; a<=9; a++)
		{for (int b=1; b<=9; b++)
		{if (a+b==14)
		{System.out.println(a+" "+b);
		}
		}
		}
	}
}