//11. 100 ������ �� ���� ������ �Է¹޾� ���� ������ ū ������ ���ʴ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
class Param_Test10 {
	public static void main(String ar[]) {
		int small,big;
		int a,b;
		a=Integer.parseInt(ar[0]);
		b=Integer.parseInt(ar[1]);
		if(a>b) {
			small=b;big=a;
		}
		else {
			small=a;big=b;
		for(;small<=big;small++) {
			System.out.print(small+" ");
		}
		}
	}
}