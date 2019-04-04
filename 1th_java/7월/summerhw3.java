//1~20 중에서 2또는 3의 배수가 아닌수의 총합 출력
class summerhw3 {
	public static void main(String ar[]) {
		int sum=0;
		for(int i=1;i<=20;i++) {
			if(i%2==0 || i%3==0)
				continue;
			sum+=i;
		}
		System.out.println(sum);
	}
}