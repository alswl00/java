//1+(-2)+3+(-4)+... �� ���� ������ ��� ���� �� ����� ���ؾ� ������ 100�� �Ǵ��� ���Ͻÿ�
class summerhw5 {
	public static void main(String ar[]) {
		int i, sum;
		for(i=1, sum=0;sum<100;i++) {
			if(i%2!=0)
				sum+=i;
			else
				sum-=i;
		}
		System.out.println(i);
	}
}