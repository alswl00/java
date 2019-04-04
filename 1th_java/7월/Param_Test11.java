//12. 정수를 입력받아서 1~입력받은 정수까지의 5의 배수의 합을 출력
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