//5. 1~30���� ¦���� Ȧ���� ���� ���� ���ϼ���
class array_Test18 {
	public static void main(String ar[]) {
		int a[]=new int [30];
		int sum1=0,sum2=0;
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
			if(a[i]%2!=0)
				sum1+=a[i];
			else
				sum2+=a[i];
		}
		System.out.println("Ȧ���� �� : "+sum1+"	¦���� �� : "+sum2);
	}
}