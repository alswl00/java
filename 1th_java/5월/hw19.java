//1과 100 사이의 정수 중 3의 배수이면서 5의 배수도, 9의 배수도 아닌 수 모두 출력
class hw19 {
	public static void main(String ar[]) {
		for (int i=3; i<=100; i+=3)
		{if (i%5!=0)
			{if (i%9!=0)
				{System.out.println(i);
				}
			}
		}
	}
}