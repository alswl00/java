//13. 100������ �ڿ��� n�Է¹޾� 1~n�� ����� ��� 
class Param_Test12 {
	public static void main(String ar[]) {
		int n=Integer.parseInt(ar[0]);
		int t=0,count=0;

		for(int i=1;i<=n;i++,count++) 
			t+=i;
		System.out.println((float)t/count);
	}
}