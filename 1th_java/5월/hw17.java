//구구단 출력(이중 for문)
class hw17 {
	public static void main(String ar[]) {
		for (int i=2; i<=9; i++)
		{System.out.println(i+"단");
		for (int j=1; j<=9; j++)
		{int m=i*j;
		System.out.println(i+"*"+j+"="+m);
		}
		System.out.println("------------------");
		}
	}
}