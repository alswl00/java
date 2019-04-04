//16. 한개의 자연수 입력받아 그 수의 배수를 차례로 10개 출력
class Param_Test15 {
	public static void main(String ar[]) {
		int a=Integer.parseInt(ar[0]);

		for(int i=1;i<=10;i++) 
			System.out.println(a*i);
	}
}