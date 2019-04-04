//1.n,m을 입력받아 두 정수 사이의 합 출력
class Param_Test5 {
	public static void main(String ar[]) {

		int n=Integer.parseInt(ar[0]);
		int m=Integer.parseInt(ar[1]);
		int sum=0,b,s;

		if(n<m) {b=m;s=n;}
		else {b=n;s=m;}
		for(int i=0;s<=b;s++) {
			sum+=s;
		}
		System.out.println(sum);
	}
}
				