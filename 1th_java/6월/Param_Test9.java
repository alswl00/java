//5. 5���� �Ű����� �Է¹޾� �ִ밪, �ּҰ����
class Param_Test9 {
	public static void main(String ar[]) {
		
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
		a[i]=Integer.parseInt(ar[i]);
		}
		int max=0,min=0;

		for(int i=0;i<a.length;i++) {
			min=a[0];
			if(a[i]>max)
				max=a[i];
			else if(a[i]<min)
				min=a[i];
		}
		System.out.println("�ִ밪 : "+max+" �ּҰ� : "+min);
	}
}