//1~20 �߿��� 2�Ǵ� 3�� ����� �ƴѼ��� ���� ���
class summerhw3 {
	public static void main(String ar[]) {
		int sum=0;
		for(int i=1;i<=20;i++) {
			if(i%2==0 || i%3==0)
				continue;
			sum+=i;
		}
		System.out.println(sum);
	}
}