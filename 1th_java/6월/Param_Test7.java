//3.n,m �Է¹޾� �� �� ������ ��� ���
class Param_Test7 {
	public static void main(String ar[]) {
		
		int n=Integer.parseInt(ar[0]);
		int m=Integer.parseInt(ar[1]);
		int sum=0,b,s,count;

		if(n<m) {
			b=m;s=n;
		}
		else {
			b=n;s=m;
		}

		for(count=1;s<=b;s++) {
			sum+=s;
			count++;
		}
		System.out.println((float)sum/count);
	}
}