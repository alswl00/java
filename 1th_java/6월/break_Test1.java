//1~10���� 3�� ����� �����ϰ� ���
class break_Test1 {
	public static void main(String ar[]) {
		for (int i=1;i<=10;i++) {
			if(i%3==0)
				continue;
			System.out.println(i);
		}
	}
}