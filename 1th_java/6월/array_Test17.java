//4.100~999 ���̿� 4�� ����� �ƴ� ������ ������ ��
class array_Test17 {
	public static void main(String ar[]) {
		int a[]=new int[900];
		int count=0,sum=0;
		for(int i=0;i<a.length;i++) {
			a[i]=i+100;
			if(a[i]%4!=0) {
				count++;
				sum+=a[i];
			}
		}
		System.out.println("���� : "+count+"	�� : "+sum);
	}
}