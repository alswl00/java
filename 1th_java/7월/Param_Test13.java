//14. �Է¹��� 10���� ���� �� ¦���� ������ Ȧ���� ������ ���� ���
class Param_Test13 {
	public static void main(String ar[]) {
		int a[]=new int[10];
		int c1=0,c2=0;
		
		for(int i=0;i<a.length;i++) {
			a[i]=Integer.parseInt(ar[i]);
			if(a[i]%2!=0) c1++;
			else c2++;
		}
		System.out.println("Ȧ�� : "+c1+"��	¦�� : "+c2+"��");
	}
}