//4.�Է¹��� �� ���� ���̿��� 3�ǹ���̰ų� 7�� ����� ������ ��, ��� ���
class Param_Test8 {
	public static void main(String ar[]) { 
		int n=Integer.parseInt(ar[0]);
		int m=Integer.parseInt(ar[1]);
		int b,s,sum=0,count;

		if(n>m) {
			b=n;s=m;
		}
		else {
			b=m;s=n;
		}

		for(count=0;s<=b;s++) {
			if(s%3==0 || s%7==0) {
				sum+=s;	
				count++;
			}
		}
		System.out.println("�� : "+sum+" ��� : "+((float)sum/count));
	}
}