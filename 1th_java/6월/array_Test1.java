//�迭�� ����ִ� ��/�迭 ũ�� ���
class array_Test1 {
	public static void main(String ar[]) {
		int a[];
		a=new int[5];

		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		System.out.println("�迭�� ũ�� : "+a.length);
	}
}