//1~50까지 3의 배수에 "박수 짝" 출력
class for_Test6 {
	public static void main(String ar[]) {
		for (int i=1; i<=50; i++)
		{if (i%3==0)
		{System.out.println(i+" 박수 짝");}
		else {System.out.println(i);}
		}
	}
}