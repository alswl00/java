//15. �ΰ��� ������ �Է¹޾� �� ���� ������ ���� ���̿� 3�ǹ���̰ų� 5�� ����� ������ ��,��� ���
class Param_Test14 {
	public static void main(String ar[]) {
		int a=Integer.parseInt(ar[0]);
		int b=Integer.parseInt(ar[1]);
		int small,big,sum=0,count=0;

		if(a>b) {
			small=b;big=a;
		}
		else {
			small=a;big=b;
		}

		for(;small<=big;small++,count++) {
			if(small%3==0 || small%5==0) 
				sum+=small;
		}
		System.out.println("�� : "+sum+"	 ��� : "+(float)sum/count);
	}
}