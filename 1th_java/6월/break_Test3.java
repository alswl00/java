//1~100���� ���� �� ���� 100�� �Ѵ� ������ ���� ���
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