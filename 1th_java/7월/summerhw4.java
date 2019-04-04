//1+(1+2)+(1+2+3)+...+(1+2+...+10)의 결과 출력
class summerhw4 {
	public static void main(String ar[]) {
		int sum=0;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) 
				sum+=j;
		}
		System.out.println(sum);
	}
}