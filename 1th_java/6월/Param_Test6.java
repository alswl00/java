//2.100이하의 정수 2개 입력받아 차례대로 출력
class Param_Test6 {
	public static void main(String ar[]) {
		int a=Integer.parseInt(ar[0]);
		int b=Integer.parseInt(ar[1]);
		int B,S;

		if(a>100||b>100) 
			System.out.println("100이하의 정수를 입력하시오");

		if(a>b) {
			B=a;S=b;
		}
		else {
			B=b;S=a;
		}

		for(int i=0;S<=B;S++) 
			System.out.print(S+" ");
		System.out.println("");
	}
}