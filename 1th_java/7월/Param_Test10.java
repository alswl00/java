//11. 100 이하의 두 개의 정수를 입력받아 작은 수부터 큰 수까지 차례대로 출력하는 프로그램을 작성하시오.
class Param_Test10 {
	public static void main(String ar[]) {
		int small,big;
		int a,b;
		a=Integer.parseInt(ar[0]);
		b=Integer.parseInt(ar[1]);
		if(a>b) {
			small=b;big=a;
		}
		else {
			small=a;big=b;
		for(;small<=big;small++) {
			System.out.print(small+" ");
		}
		}
	}
}