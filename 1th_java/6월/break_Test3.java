//1~100까지 더할 때 합이 100이 넘는 순간의 숫자 출력
class break_Test3 {
	public static void main(String ar[]) {
		int sum=0;
		for (int i=1; i<=100; i++) {
			sum+=i;
			if (sum>100) {
				System.out.println(i);
				break;
		}
		}
	}
}