//13. 100이하의 자연수 n입력받아 1~n의 평균을 출력 
class Param_Test12 {
	public static void main(String ar[]) {
		int n=Integer.parseInt(ar[0]);
		int t=0,count=0;

		for(int i=1;i<=n;i++,count++) 
			t+=i;
		System.out.println((float)t/count);
	}
}