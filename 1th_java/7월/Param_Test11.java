//12. ������ �Է¹޾Ƽ� 1~�Է¹��� ���������� 5�� ����� ���� ���
class Param_Test11 {
	public static void main(String ar[]) {
		int a=Integer.parseInt(ar[0]);
		int sum=0;
		
		for(int i=1;i<=a;i++) {
			if(i%5==0)
				sum+=i;
		}
		System.out.println(sum);
	}
}